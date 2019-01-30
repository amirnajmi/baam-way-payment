package ir.co.sadad.eb.service;

import ir.co.sadad.eb.domain.Account;
import ir.co.sadad.eb.mapper.AccountMapper;
import ir.co.sadad.eb.repository.api.AccountRepository;
import ir.co.sadad.eb.repository.api.IRepository;
import ir.co.sadad.eb.service.dto.AccountDto;
import ir.co.sadad.eb.service.impl.AbstractGenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class AccountService extends AbstractGenericService<Account,Long> {

    @Inject
    AccountMapper accountMapper;

    @Inject
    AccountService(AccountRepository accountRepository){
        super(accountRepository);
    }

    public AccountService() {
    }

    @Inject
    AccountRepository accountRepository;
    public AccountDto createAccount(AccountDto accountDto){
        Account save = accountRepository.save(accountMapper.accountDtoToAccount(accountDto));
        return accountMapper.accountToAccountDto(save);
    }

}
