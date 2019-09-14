package com.links.springangularauth.repositories;

import com.links.springangularauth.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail( String email );
}
