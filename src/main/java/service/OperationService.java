package service;

import entity.Operation;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
public interface OperationService {
    Operation addOperation (Operation operation);
    void delete (long id);
    List<Operation> getAll();
}
