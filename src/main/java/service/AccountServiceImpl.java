package service;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import repository.AccountRepository;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;



    @Transactional
    @Override
    public Account addAccount (Account account) {
        accountRepository.saveAndFlush(account);

        return account;
    }

    @Transactional
    @Override
    public void delete(long id) {
        accountRepository.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Account getByName(String name) {
        return accountRepository.findByName(name);
    }

    @Transactional
    @Override
    public Account editAccount(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @Transactional
    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }




}
