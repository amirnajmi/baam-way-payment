package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.LadingBillStatus;
import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.mapper.LadingBillStatusHistoryMapper;
import ir.co.sadad.eb.repository.api.LadingBillStatusHistoryRepository;
import ir.co.sadad.eb.service.api.ILadingBillStatusHistoryService;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingBillStatusDto;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.util.HttpStatusCode;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.time.LocalDate;

@Stateless
public class LadingBillStatusHistoryService extends AbstractGenericService<LadingBillStatusHistory, Long> implements ILadingBillStatusHistoryService {

    @Inject
    private LadingBillStatusHistoryMapper ladingBillStatusHistoryMapper;

    @Inject
    public LadingBillStatusHistoryService(LadingBillStatusHistoryRepository genericRepository) {
        super(genericRepository);
    }

    @Inject
    private ILadingOfBillService iLadingOfBillService;

    public LadingBillStatusHistoryService() {
    }

    public LadingBillStatusHistoryDto createLadingBillStatusHistory(LadingBillStatusHistoryDto ladingBillStatusHistoryDto) throws BusinessException {
        BusinessException businessException = new BusinessException(HttpStatusCode.BAD_REQUEST);
        if(ladingBillStatusHistoryDto.getLadingOfBill().getTrackingCode() == null || ladingBillStatusHistoryDto.getLadingOfBill().getTrackingCode() == 0){
            businessException.add("ladingOfBillNo.trackingCode.isNullOrZero");
        }

        if(ladingBillStatusHistoryDto.getLadingBillStatus() == null){
            businessException.add("ladingBillStatus.is.null");
            throw businessException;
        }

        LadingBillStatusDto inputStatus = LadingBillStatusDto.getEnum(ladingBillStatusHistoryDto.getLadingBillStatus().name());
        if(inputStatus.equals(LadingBillStatusDto.NONE)){
            businessException.add("ladingBillStatus.is.invalid");
        }

        if(!businessException.messageIsEmpty()){
            throw businessException;
        }

        LadingOfBillDto ladingOfBillDto = iLadingOfBillService.findByTrackingCode(ladingBillStatusHistoryDto.getLadingOfBill().getTrackingCode());
        ladingBillStatusHistoryDto.setLadingOfBill(ladingOfBillDto);
        ladingBillStatusHistoryDto.setLadingBillStatus(inputStatus);
        ladingBillStatusHistoryDto.setDate(LocalDate.now());
        ladingBillStatusHistoryDto.setDescription(ladingBillStatusHistoryDto.getDescription());
        LadingBillStatusHistory ladingBillStatusHistory = ladingBillStatusHistoryMapper.ladingBillStatusHistoryDtoToLadingBillStatusHistory(ladingBillStatusHistoryDto);
        LadingBillStatusHistory entityResult = save(ladingBillStatusHistory);
        LadingBillStatusHistoryDto result = ladingBillStatusHistoryMapper.ladingBillStatusHistoryToLadingBillStatusHistoryDto(entityResult);
        return result;
    }
}
