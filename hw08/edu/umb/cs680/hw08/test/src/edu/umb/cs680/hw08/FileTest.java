package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import edu.umb.cs680.hw08.Directory;
import edu.umb.cs680.hw08.File;
import edu.umb.cs680.hw08.Link;

public class FileTest 
{
    
    static LocalDateTime localTime = LocalDateTime.now();
  
    Directory root = new Directory(null, "Root", 0, localTime);
    Directory Apps = new Directory(root, "Apps", 0, localTime);
    Directory bin = new Directory(root, "bin", 0, localTime);
    Directory home = new Directory(root, "home", 0, localTime);
    File a = new File(home, "a", 10, localTime);
    File b = new File(home, "b", 20, localTime);
    File c = new File(bin, "c", 30, localTime);
    File x = new File(Apps, "x", 40, localTime);
    File y = new File(Apps, "y", 50, localTime);
    Link d = new Link(bin, "d", 0, localTime, Apps);
    Link e = new Link(home, "e", 0, localTime, x);
    Link f = new Link(home, "f", 0, localTime, d);
    
    Directory pictures = new Directory(home, "pictures", 0, localTime);

   private String[] fileToStringArray(File f) {
		String[] fileInfo = { String.valueOf(f.isDirectory()), f.getName(), String.valueOf(f.getSize()),
				String.valueOf(f.getCreationTime()), f.getParent().getName() };
		return fileInfo;
	}
    
    @Test
    public void verifyFileEqualityX() 
    {
        String[] expected = { "false", "x", "40", localTime.toString(), "Apps" };
        File actual = x;
        assertArrayEquals(expected, fileToStringArray(actual));
    }

    @Test
    public void verifyFileInequality() 
    {
        File actual = c;
        File expected = y;
        assertNotEquals(expected, actual);
    }

    @Test
	public void verifyFileIsLink() 
    {
		assertFalse(x.isLink());
	}

    

}
    

