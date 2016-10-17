package repository;

import entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aleksey on 21.09.2016.
 */
public interface CurrencyRepository extends JpaRepository <Currency, Long>{
}
