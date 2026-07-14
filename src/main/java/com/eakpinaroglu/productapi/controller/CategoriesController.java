package com.eakpinaroglu.productapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eakpinaroglu.productapi.model.Category.AddCategoryRequest;
import com.eakpinaroglu.productapi.model.Category.AddCategoryResponse;
import com.eakpinaroglu.productapi.service.Category.CategoryService;

import lombok.RequiredArgsConstructor;

@RequestMapping("api/v1/categories")
@RestController
@RequiredArgsConstructor
public class CategoriesController {
    
    private final CategoryService categoryService;
    

    @PostMapping
    public AddCategoryResponse AddCategory(@RequestBody AddCategoryRequest request) {
        var response = categoryService.AddCategory(request);
        return response;
    }

    @GetMapping
    public List<AddCategoryResponse> GetCategories() {
        var response = categoryService.ListCategories();
        return response;
    }
}
