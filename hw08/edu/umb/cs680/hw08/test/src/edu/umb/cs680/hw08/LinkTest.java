package edu.umb.cs680.hw08;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import edu.umb.cs680.hw08.Directory;
import edu.umb.cs680.hw08.File;
import edu.umb.cs680.hw08.Link;

public class LinkTest 
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

    private String[] linkToStringArray(Link l) 
    {
		String[] linkInfo = { String.valueOf(l.isLink()), l.getName(), String.valueOf(l.getSize()),
				String.valueOf(l.getCreationTime()), l.getParent().getName(), l.getTarget().getName() };
		return linkInfo;
   }


   @Test
   public void verifyLinkEquality() 
   {
       String[] expected = { "true", "d", "0", localTime.toString(), "bin", "Apps" };
       Link actualLink = d;
       String[] actual = linkToStringArray(actualLink);
       assertArrayEquals(expected, actual);
   }

   @Test
   public void verifyLinkName() 
   {
       String expected = "f";
       String actual = f.getName();
       assertEquals(expected, actual);
   }

   @Test
	public void isDirectory() {
		assertFalse(e.isDirectory());
	}
	

  
    
}
