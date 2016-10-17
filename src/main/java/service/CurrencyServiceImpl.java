package service;

import entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.CurrencyRepository;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
@Service
public class CurrencyServiceImpl implements CurrencyService{
    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    @Transactional
    public Currency addCurrency(Currency currency) {
        return currencyRepository.saveAndFlush(currency);
    }

    @Transactional
    @Override
    public void delete(long id) {
        currencyRepository.delete(id);
    }

    @Transactional
    @Override
    public List<Currency> getAll() {
        return currencyRepository.findAll();
    }
}





