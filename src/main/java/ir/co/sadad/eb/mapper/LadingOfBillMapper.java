package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import org.mapstruct.Mapper;

@Mapper
public interface LadingOfBillMapper {

    LadingOfBill ladingOfBillDtoToLadingOfBill(LadingOfBillDto ladingOfBillDto);
    LadingOfBillDto ladingOfBillToLadingOfBillDto(LadingOfBill ladingOfBill);
}
