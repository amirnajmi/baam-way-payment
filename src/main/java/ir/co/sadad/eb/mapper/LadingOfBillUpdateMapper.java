package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.service.dto.LadingOfBillUpdateDto;
import org.mapstruct.Mapper;

@Mapper
public interface LadingOfBillUpdateMapper {

    LadingOfBill LadingOfBillUpdateDtoToLadingOfBill(LadingOfBillUpdateDto ladingOfBillUpdateDto);
    LadingOfBillUpdateDto ladingOfBillToLadingOfBillUpdateDto(LadingOfBill ladingOfBill);

}
