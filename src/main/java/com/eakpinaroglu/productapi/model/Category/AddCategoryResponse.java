package com.eakpinaroglu.productapi.model.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddCategoryResponse {

     public String Name;
    public String Description;
    public Boolean Active;
    
}
