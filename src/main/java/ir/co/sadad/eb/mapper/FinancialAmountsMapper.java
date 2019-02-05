package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.FinancialAmounts;
import ir.co.sadad.eb.service.dto.FinancialAmountsDto;
import org.mapstruct.Mapper;

@Mapper
public interface FinancialAmountsMapper {

    FinancialAmounts financialAmountsDtoToFinancialAmounts(FinancialAmountsDto financialAmountsDto);
    FinancialAmountsDto financialAmountsToFinancialAmountsDto(FinancialAmounts financialAmounts);
}
