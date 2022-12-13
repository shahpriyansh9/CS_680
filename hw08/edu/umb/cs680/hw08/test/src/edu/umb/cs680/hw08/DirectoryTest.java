package edu.umb.cs680.hw08;


import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import edu.umb.cs680.hw08.Directory;
import edu.umb.cs680.hw08.File;
import edu.umb.cs680.hw08.Link;

public class DirectoryTest 
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
    
    
    Directory pictures = new Directory(home, "pictures", 0, localTime);

    private String[] dirToStringArray(Directory d) 
    {
		String[] dirInfo = { String.valueOf(d.isDirectory()), d.getName(), String.valueOf(d.getTotalSize()),
				String.valueOf(d.getCreationTime()), String.valueOf(d.countChildren()) };
		return dirInfo;
	}

    @Test
    public void verifygetTotalSize()
    {
        assertEquals(160, root.getTotalSize());
    }

    @Test
    public void verifyCountChildren() 
    {
      assertEquals(3, root.countChildren());
      assertEquals(2, Apps.countChildren());
      assertEquals(3, home.countChildren());
    }

    @Test
	public void isDirectory() 
    {
		assertTrue(root.isDirectory());
	}

    @Test
	public void isLinkTestingFalse() {
		assertFalse(root.isLink());
	}

    @Test
    public void verifyDirectoryEqualityWithHome() 
    {
		String[] expected = { "true", "home", "80", localTime.toString(), "3" };
		Directory actual = home;
		assertArrayEquals(expected, dirToStringArray(actual));
	}

    @Test
    public void verifyDirectoryEquality() {
		String[] expected = { "true", "bin", "30", localTime.toString(), "2" };
		Directory actual = bin;
		assertArrayEquals(expected, dirToStringArray(actual));
	}
}
