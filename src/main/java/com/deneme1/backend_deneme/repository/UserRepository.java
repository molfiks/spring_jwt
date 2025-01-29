package com.deneme1.backend_deneme.repository;

import com.deneme1.backend_deneme.entities.Role;
import com.deneme1.backend_deneme.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
