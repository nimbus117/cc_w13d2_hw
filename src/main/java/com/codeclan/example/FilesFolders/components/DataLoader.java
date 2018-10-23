package com.codeclan.example.FilesFolders.components;

import com.codeclan.example.FilesFolders.models.File;
import com.codeclan.example.FilesFolders.models.Folder;
import com.codeclan.example.FilesFolders.models.User;
import com.codeclan.example.FilesFolders.repositories.FileRepository;
import com.codeclan.example.FilesFolders.repositories.FolderRepository;
import com.codeclan.example.FilesFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User("Bob");
        userRepository.save(user);

        Folder folder = new Folder("MyDocs", user);
        folderRepository.save(folder);

        File file = new File("cv", "txt", 10, folder);
        fileRepository.save(file);
    }
}
