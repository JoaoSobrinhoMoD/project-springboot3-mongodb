package com.joaosobrinho.projectmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joaosobrinho.projectmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
