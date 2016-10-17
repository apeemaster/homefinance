package service;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.CategoryRepository;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    @Transactional
    public Category addCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }
    @Transactional
    @Override
    public void delete(long id) {
        categoryRepository.delete(id);
    }
    @Transactional
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
