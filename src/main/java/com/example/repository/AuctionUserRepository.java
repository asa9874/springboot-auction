package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.AuctionUser;

public interface AuctionUserRepository extends JpaRepository<AuctionUser, Long> {
}