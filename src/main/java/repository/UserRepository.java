package repository;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Aleksey on 21.09.2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM users u where u.username = :username")
    User findByUsername(@Param("username") String username);

}
