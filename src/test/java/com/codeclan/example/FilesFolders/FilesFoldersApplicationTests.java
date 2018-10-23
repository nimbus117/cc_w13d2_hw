package com.codeclan.example.FilesFolders;

import com.codeclan.example.FilesFolders.models.File;
import com.codeclan.example.FilesFolders.models.Folder;
import com.codeclan.example.FilesFolders.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesFoldersApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testClasses() {
		User user = new User("Bob");
		Folder folder = new Folder("MyDocs", user);
		File file = new File("cv", "txt", 10, folder);
		assertEquals(10, file.getSize());
	}

}
