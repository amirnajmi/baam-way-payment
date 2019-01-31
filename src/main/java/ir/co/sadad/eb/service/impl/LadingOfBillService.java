package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.mapper.LadingBillStatusHistoryMapper;
import ir.co.sadad.eb.mapper.LadingOfBillMapper;
import ir.co.sadad.eb.mapper.LadingOfBillUpdateMapper;
import ir.co.sadad.eb.repository.api.LadingOfBillRepository;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.service.dto.LadingOfBillUpdateDto;
import ir.co.sadad.eb.service.impl.AbstractGenericService;
import ir.co.sadad.eb.util.HttpStatusCode;

import javax.ejb.Stateless;
import javax.inject.Inject;
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
    public LadingOfBillService(LadingOfBillRepository genericRepository){
        super(genericRepository);
        this.ladingOfBillRepository = genericRepository;
    }

    public LadingOfBillService() {
    }

    //TODO: Transactional??
    public LadingOfBillDto createLadingOfBill(LadingOfBillDto ladingOfBillDto){
        LadingOfBill ladingOfBill = ladingOfBillMapper.ladingOfBillDtoToLadingOfBill(ladingOfBillDto);
        LadingOfBill createdLadingOfBill =save(ladingOfBill);
        return ladingOfBillMapper.ladingOfBillToLadingOfBillDto(createdLadingOfBill);
    }

    @Override
    //TODO: Transactional??
    public LadingBillStatusHistoryDto updateLadingOfBill(LadingBillStatusHistoryDto ladingBillStatusHistoryDto) {
        LadingBillStatusHistory ladingBillStatusHistory = ladingBillStatusHistoryMapper.ladingBillStatusHistoryDtoToLadingBillStatusHistory(ladingBillStatusHistoryDto);
        LadingOfBill ladingOfBill= update(ladingBillStatusHistory.getLadingOfBill());
        ladingBillStatusHistory.setLadingOfBill(ladingOfBill);
        //TODO: update Status and set for ladingBillStatusHistory.
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
