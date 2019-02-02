package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.LadingBillStatus;
import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.mapper.LadingBillStatusHistoryMapper;
import ir.co.sadad.eb.mapper.LadingOfBillMapper;
import ir.co.sadad.eb.mapper.LadingOfBillUpdateMapper;
import ir.co.sadad.eb.repository.api.LadingOfBillRepository;
import ir.co.sadad.eb.service.api.ILadingBillStatusHistoryService;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.util.HttpStatusCode;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.time.LocalDate;
import java.util.Optional;

@Stateless
public class LadingOfBillService extends AbstractGenericService<LadingOfBill, Long> implements ILadingOfBillService {

    @Inject
    private LadingOfBillMapper ladingOfBillMapper;

    @Inject
    private LadingOfBillUpdateMapper ladingOfBillUpdateMapper;

    @Inject
    private LadingBillStatusHistoryMapper ladingBillStatusHistoryMapper;

    private LadingOfBillRepository ladingOfBillRepository;

    @Inject
    private ILadingBillStatusHistoryService iLadingBillStatusHistoryService;

    @Inject
    public LadingOfBillService(LadingOfBillRepository genericRepository){
        super(genericRepository);
        this.ladingOfBillRepository = genericRepository;
    }

    public LadingOfBillService() {
    }

    //TODO: Transactional??
    public LadingBillStatusHistoryDto createLadingOfBill(LadingOfBillDto ladingOfBillDto) throws BusinessException {

        LadingBillStatusHistory ladingBillStatusHistory = new LadingBillStatusHistory();
        Optional<LadingOfBill> foundLadingOfBill=  ladingOfBillRepository.findByNoLikeAndSerialLike(ladingOfBillDto.getNo(), ladingOfBillDto.getSerial());
        if(foundLadingOfBill.isPresent()){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "LADING_OF_BILL_IS_DUPLICATE");
        }
        LadingOfBill ladingOfBill = ladingOfBillMapper.ladingOfBillDtoToLadingOfBill(ladingOfBillDto);
        LadingOfBill createdLadingOfBill =save(ladingOfBill);
        //TODO: external method:
        ladingBillStatusHistory.setLadingOfBill(createdLadingOfBill);
        LadingBillStatus ladingBillStatus= LadingBillStatus.getEnum(LadingBillStatus.INITIAL_REGISTRATION.getCode());
        ladingBillStatusHistory.setLadingBillStatus(ladingBillStatus);
        ladingBillStatusHistory.setDescription(LadingBillStatus.INITIAL_REGISTRATION.getTitle());
        ladingBillStatusHistory.setDate(LocalDate.now());
        iLadingBillStatusHistoryService.save(ladingBillStatusHistory);
        //
        return ladingBillStatusHistoryMapper.ladingBillStatusHistoryToLadingBillStatusHistoryDto( ladingBillStatusHistory );

    }

    @Override
    //TODO: Transactional??
    public LadingBillStatusHistoryDto updateLadingOfBill(LadingOfBillDto ladingOfBillDto) throws BusinessException {
        LadingBillStatusHistory ladingBillStatusHistory = new LadingBillStatusHistory();

        if(ladingOfBillDto.getSerial() == null ){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "SERIAL_IS_EMPTY");
        }
        if(ladingOfBillDto.getNo() == null ){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "NO_IS_EMPTY");
        }
        if(ladingOfBillDto.getDriverContribution() == null ){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "DRIVER_CONTRIBUTION_IS_EMPTY");
        }
        if(ladingOfBillDto.getShippingCompanyContribution() == null ){
            throw new BusinessException(HttpStatusCode.BAD_REQUEST, "DRIVER_CONTRIBUTION_IS_EMPTY");
        }

        Optional<LadingOfBill> ladingOfBill = ladingOfBillRepository.findByNoLikeAndSerialLike(ladingOfBillDto.getNo(), ladingOfBillDto.getSerial());
        if(ladingOfBill.isPresent()){
            ladingOfBill.get().setDriverContribution(ladingOfBillDto.getDriverContribution());
            ladingOfBill.get().setShippingCompanyContribution(ladingOfBillDto.getShippingCompanyContribution());
        }
        LadingOfBill updatedLadingOfBill= update(ladingOfBill.get());

        //TODO: external method:
        ladingBillStatusHistory.setLadingOfBill(updatedLadingOfBill);
        LadingBillStatus ladingBillStatus= LadingBillStatus.getEnum(LadingBillStatus.CONTRIBUTIONS_DETERMINED.getCode());
        ladingBillStatusHistory.setLadingBillStatus(ladingBillStatus);
        ladingBillStatusHistory.setDescription(LadingBillStatus.CONTRIBUTIONS_DETERMINED.getTitle());
        ladingBillStatusHistory.setDate(LocalDate.now());
        iLadingBillStatusHistoryService.save(ladingBillStatusHistory);
        //

        return ladingBillStatusHistoryMapper.ladingBillStatusHistoryToLadingBillStatusHistoryDto( ladingBillStatusHistory );
    }

    @Override
    public LadingOfBillDto findByNoAndSerial(String no, String serial) throws BusinessException {
        Optional<LadingOfBill> ladingOfBill = ladingOfBillRepository.findByNoLikeAndSerialLike(no, serial);
        if(ladingOfBill.isPresent()){
            return ladingOfBillMapper.ladingOfBillToLadingOfBillDto(ladingOfBill.get());
        }
        throw new BusinessException(HttpStatusCode.NOT_FOUND, "LADING_OF_BILL_NOT_FOUND");
    }
}
