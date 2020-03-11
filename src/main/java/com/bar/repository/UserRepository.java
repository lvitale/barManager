package com.bar.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bar.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
    List<User> findByName(String name);

}
