package com.husseinabdallah287.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.husseinabdallah287.fullstackbackend.model.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}
