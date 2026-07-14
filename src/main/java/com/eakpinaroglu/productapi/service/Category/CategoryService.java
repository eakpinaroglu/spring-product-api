package com.eakpinaroglu.productapi.service.Category;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eakpinaroglu.productapi.entity.Category;
import com.eakpinaroglu.productapi.model.Category.AddCategoryRequest;
import com.eakpinaroglu.productapi.model.Category.AddCategoryResponse;
import com.eakpinaroglu.productapi.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public AddCategoryResponse AddCategory(AddCategoryRequest request) {
        
        Category category = new Category();
        category.setName(request.name);
        category.setDescription(request.description);
        category.setActive(request.active);
        
       Category saved =  categoryRepository.save(category);
    

        AddCategoryResponse response = new AddCategoryResponse();
        response.setActive(saved.getActive());
        response.setDescription(saved.getDescription());
        response.setName(saved.getName());
        return response;
    }


    @Override
    public List<AddCategoryResponse> ListCategories() {
        List<Category> categories = categoryRepository.findAll();
        List<AddCategoryResponse> result = categories.stream().map(x-> {
            var model =  new AddCategoryResponse();
            model.setActive(x.getActive());
            model.setName(x.getName());
            model.setDescription(x.getDescription());
            return model;
        }).toList();
        return result;
    }
    
}
