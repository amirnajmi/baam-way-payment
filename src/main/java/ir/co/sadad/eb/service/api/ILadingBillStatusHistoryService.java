package ir.co.sadad.eb.service.api;

import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;

public interface ILadingBillStatusHistoryService extends IService<LadingBillStatusHistory, Long> {

    LadingBillStatusHistoryDto createLadingBillStatusHistory(LadingBillStatusHistoryDto ladingBillStatusHistoryDto);
}
