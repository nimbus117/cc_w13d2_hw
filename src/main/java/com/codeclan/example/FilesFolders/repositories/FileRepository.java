package com.codeclan.example.FilesFolders.repositories;

import com.codeclan.example.FilesFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
