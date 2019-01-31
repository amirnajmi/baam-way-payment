package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.Account;
import ir.co.sadad.eb.service.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper
public interface AccountMapper {

    Account accountDtoToAccount(AccountDto accountDto);
    AccountDto accountToAccountDto(Account account);

}
