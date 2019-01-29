package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.LadingBillStatus;
import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.mapper.LadingBillStatusHistoryMapper;
import ir.co.sadad.eb.repository.api.LadingBillStatusHistoryRepository;
import ir.co.sadad.eb.service.api.ILadingBillStatusHistoryService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;

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

    public LadingBillStatusHistoryService() {
    }

    public LadingBillStatusHistoryDto createLadingBillStatusHistory(LadingBillStatusHistoryDto ladingBillStatusHistoryDto){
        LadingBillStatusHistory ladingBillStatusHistory = ladingBillStatusHistoryMapper.ladingBillStatusHistoryDtoToLadingBillStatusHistory(ladingBillStatusHistoryDto);
        return ladingBillStatusHistoryMapper.ladingBillStatusHistoryToLadingBillStatusHistoryDto(save(ladingBillStatusHistory));
    }


}
