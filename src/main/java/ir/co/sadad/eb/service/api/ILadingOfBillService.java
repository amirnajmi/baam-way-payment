package ir.co.sadad.eb.service.api;

import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;

public interface ILadingOfBillService extends IService<LadingOfBill, Long>{

    LadingOfBillDto createLadingOfBill(LadingOfBillDto ladingOfBillDto);
}
