package repository;

import entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Aleksey on 21.09.2016.
 */
public interface AccountRepository extends JpaRepository <Account, Long>{
    @Query("select b from Account b where b.name = :name")
    Account findByName(@Param("name") String name);
}
