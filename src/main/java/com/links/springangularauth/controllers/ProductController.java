package com.links.springangularauth.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.links.springangularauth.models.Products;
import com.links.springangularauth.repositories.ProductRepository;

@CrossOrigin( origins = "*" )
@RequestMapping( "/api" )
@RestController
public class ProductController {

    @Autowired ProductRepository productRepository;

    @RequestMapping( method = RequestMethod.GET, value = "/products" )
    public Iterable<Products> product() {
        return productRepository.findAll();
    }
}
