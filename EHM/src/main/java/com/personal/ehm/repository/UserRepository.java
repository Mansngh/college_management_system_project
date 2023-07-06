package com.personal.ehm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.ehm.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
