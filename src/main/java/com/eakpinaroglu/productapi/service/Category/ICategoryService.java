package com.eakpinaroglu.productapi.service.Category;

import com.eakpinaroglu.productapi.model.Category.AddCategoryRequest;
import com.eakpinaroglu.productapi.model.Category.AddCategoryResponse;

public interface ICategoryService {
    
    AddCategoryResponse AddCategory(AddCategoryRequest request);
}
