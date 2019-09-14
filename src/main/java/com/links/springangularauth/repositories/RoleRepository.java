package com.links.springangularauth.repositories;

import com.links.springangularauth.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole( String role );
}
