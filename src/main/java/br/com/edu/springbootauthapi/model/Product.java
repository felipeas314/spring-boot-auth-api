package br.com.edu.springbootauthapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String code;

    private String name;

    private String description;
}
