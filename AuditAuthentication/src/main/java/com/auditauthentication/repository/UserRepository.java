package com.auditauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditauthentication.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
