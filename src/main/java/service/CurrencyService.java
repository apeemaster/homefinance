package service;

import entity.Currency;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
public interface CurrencyService {
    Currency addCurrency(Currency currency);
    void delete (long id);
    List<Currency> getAll();




}
