package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.mapper.LadingBillStatusHistoryMapper;
import ir.co.sadad.eb.repository.api.LadingBillStatusHistoryRepository;
import ir.co.sadad.eb.service.api.ILadingBillStatusHistoryService;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;

import javax.ejb.Stateless;
import javax.inject.Inject;

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
        LadingOfBillDto ladingOfBillDto = iLadingOfBillService.findByNoAndSerial(ladingBillStatusHistoryDto.getLadingOfBill().getNo(), ladingBillStatusHistoryDto.getLadingOfBill().getSerial());
        ladingBillStatusHistoryDto.setLadingOfBill(ladingOfBillDto);
        LadingBillStatusHistory ladingBillStatusHistory = ladingBillStatusHistoryMapper.ladingBillStatusHistoryDtoToLadingBillStatusHistory(ladingBillStatusHistoryDto);
        return ladingBillStatusHistoryMapper.ladingBillStatusHistoryToLadingBillStatusHistoryDto(save(ladingBillStatusHistory));
    }
}
