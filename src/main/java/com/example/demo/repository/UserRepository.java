package com.example.demo.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.example.demo.entity.User;

public interface UserRepository 
    extends CosmosRepository<User, String> {

}
