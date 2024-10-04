package com.example.repository;

import com.example.model.AuctionUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionUserRepository extends JpaRepository<AuctionUser, Long> {
}