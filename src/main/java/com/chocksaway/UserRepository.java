package com.chocksaway;

import org.springframework.data.repository.CrudRepository;

/**
 * Author milesd on 15/09/2018.
 */


public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);


}