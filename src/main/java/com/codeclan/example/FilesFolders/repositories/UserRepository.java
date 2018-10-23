package com.codeclan.example.FilesFolders.repositories;

import com.codeclan.example.FilesFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
