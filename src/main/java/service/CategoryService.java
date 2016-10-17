package service;

import entity.Category;

import java.util.List;

/**
 * Created by Aleksey on 23.09.2016.
 */
public interface CategoryService {
    Category addCategory(Category category);
    void delete (long id);
    List<Category> getAll();




}
