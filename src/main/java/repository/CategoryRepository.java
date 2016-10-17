package repository;

import entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aleksey on 21.09.2016.
 */
public interface CategoryRepository extends JpaRepository <Category, Long> {
}
