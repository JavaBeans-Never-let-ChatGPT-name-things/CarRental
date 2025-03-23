package com.example.backend.repository;

import com.example.backend.entity.LogoutToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LogoutTokenRepository extends JpaRepository<LogoutToken, String> {
    Optional<LogoutToken> findByToken(String token);
}
