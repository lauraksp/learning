package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
//    List<UserEntity> findByFirstname (String firstname);

//    List<UserEntity> findByEmail (String email);

    @Query("SELECT * FROM user u where u.firstname ?1")
    List<UserEntity> findByEmail (String email);

}
