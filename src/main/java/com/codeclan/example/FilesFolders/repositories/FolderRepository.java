package com.codeclan.example.FilesFolders.repositories;

import com.codeclan.example.FilesFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
