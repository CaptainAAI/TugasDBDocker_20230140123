package com.praktikumDB.deploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.praktikumDB.deploy.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
