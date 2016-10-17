package service;

import entity.Account;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
public interface AccountService {

    Account addAccount (Account account);
    void delete (long id);
    Account getByName (String name);
    Account editAccount (Account account);
    List <Account> getAll();

}
