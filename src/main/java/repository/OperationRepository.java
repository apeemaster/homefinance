package repository;

import entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aleksey on 21.09.2016.
 */
public interface OperationRepository extends JpaRepository <Operation,Long>{
}
