package ir.co.sadad.eb.service.api;

import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.service.dto.LadingOfBillUpdateDto;

public interface ILadingOfBillService extends IService<LadingOfBill, Long>{

    LadingOfBillDto createLadingOfBill(LadingOfBillDto ladingOfBillDto);


    LadingBillStatusHistoryDto updateLadingOfBill(LadingBillStatusHistoryDto ladingBillStatusHistoryDto);
}
