package service;

import entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.OperationRepository;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
@Service
public class OperationServiceImpl implements OperationService{
    @Autowired
    private OperationRepository operationRepository;
    @Transactional
    @Override
    public Operation addOperation (Operation operation) {
        operationRepository.saveAndFlush(operation);

        return operation;
    }
    @Transactional
    @Override
    public void delete(long id) {
       operationRepository.delete(id);
    }
    @Transactional
    @Override
    public List<Operation> getAll() {
        return operationRepository.findAll();
    }

}
