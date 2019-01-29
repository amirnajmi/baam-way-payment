package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.LadingBillStatusHistory;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import org.mapstruct.Mapper;

@Mapper
public interface LadingBillStatusHistoryMapper {

    LadingBillStatusHistory ladingBillStatusHistoryDtoToLadingBillStatusHistory(LadingBillStatusHistoryDto ladingBillStatusHistoryDto);
    LadingBillStatusHistoryDto ladingBillStatusHistoryToLadingBillStatusHistoryDto(LadingBillStatusHistory ladingBillStatusHistory);
}
