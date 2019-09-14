package com.links.springangularauth.repositories;

import com.links.springangularauth.models.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, String> {

    @Override void delete( Products deleted );
}
