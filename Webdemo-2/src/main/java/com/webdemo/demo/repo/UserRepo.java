package com.webdemo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdemo.demo.model.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Long> {
	AppUser findByUsernameAndPassword(String username, String password);
}
