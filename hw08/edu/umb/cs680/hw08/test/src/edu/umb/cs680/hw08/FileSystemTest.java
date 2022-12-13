package edu.umb.cs680.hw08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import edu.umb.cs680.hw08.FileSystem;

public class FileSystemTest 
{
    @Test
	void test_getFilesystem() {
		FileSystem fs = FileSystem.getFileSystem();
		assertEquals(fs, FileSystem.getFileSystem());
		
	}

    @Test
	public void getFileSystemisNotNull() {
		assertNotNull(FileSystem.getFileSystem());
	}
    
}
