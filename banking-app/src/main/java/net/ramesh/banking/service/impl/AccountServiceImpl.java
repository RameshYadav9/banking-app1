package net.ramesh.banking.service.impl;

import net.ramesh.banking.dto.AccountDto;
import net.ramesh.banking.entity.Account;
import net.ramesh.banking.repository.AccountRepository;
import net.ramesh.banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {



    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto account) {

        return null;
    }
}
