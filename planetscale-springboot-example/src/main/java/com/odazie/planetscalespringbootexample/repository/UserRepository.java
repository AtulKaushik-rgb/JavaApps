package com.odazie.planetscalespringbootexample.repository;

import com.odazie.planetscalespringbootexample.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
