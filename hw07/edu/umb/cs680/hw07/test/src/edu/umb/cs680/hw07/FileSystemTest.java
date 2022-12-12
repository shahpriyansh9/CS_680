package edu.umb.cs680.hw07;


import java.time.LocalDateTime;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw07.Directory;
import edu.umb.cs680.hw07.FileSystem;


public class FileSystemTest 
{
    @Test
    public void getFileSystemNotNull()
    {
        assertNotNull(FileSystem.getFileSystem());

    }
    
    @Test
	public void checkfilesystem() {
		FileSystem firstfile = FileSystem.getFileSystem();
		FileSystem secondfile = FileSystem.getFileSystem();
		assertSame(firstfile, secondfile);
	}

    
}
