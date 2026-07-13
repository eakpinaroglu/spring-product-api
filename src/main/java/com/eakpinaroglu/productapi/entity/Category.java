package com.eakpinaroglu.productapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category",schema = "PRODUCT")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 250)
    private String description;

    @Column(nullable = false)
    private Boolean active;    
}
