package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw07.Directory;
import edu.umb.cs680.hw07.FileSystem;

public class FileTest 
{
    static LocalDateTime localTime = LocalDateTime.now();

//Directory root
Directory root = new Directory(null, "root", 0, localTime);

//Directory Apps
Directory apps = new Directory(root, "Apps", 0, localTime);

//Directory lib
Directory lib = new Directory(root, "lib", 0, localTime);

//Directory home
Directory home = new Directory(root, "home", 0, localTime);

//File x
File x = new File(lib, "x", 10, localTime);

//File y
File y = new File(lib, "y", 20, localTime);

//File z
File z = new File(home, "z", 30, localTime);

//Directory code
Directory code = new Directory(home, "code", 0, localTime);

//File a
File a = new File(code, "a", 40, localTime);

//File b
File b = new File(code, "b", 50, localTime);

//File c
File c = new File(code, "c", 60, localTime);

//File d
File d = new File(home, "d", 70, localTime);

private String[] fileToStringArray(File f) 
    {
        String[] fileInfo = { String.valueOf(f.isDirectory()), f.getName(), String.valueOf(f.getSize()),
                String.valueOf(f.getCreationTime()), f.getParent().getName() };
            return fileInfo;

    
    }

    @Test
    public void testEqualityForFile1() 
    {
        File expected = new File(lib, "x", 10, localTime);
        File actual = new File(code, "x", 10, localTime);
        assertFalse(expected.equals(actual));
    }

    @Test
    public void testEqualityForFile2() 
    {
        File expected = new File(home, "d", 70, localTime);
        File actual = new File(code, "d", 70, localTime);
        assertFalse(expected.equals(actual));
    }

    @Test
    public void testEqualityForFile3() 
    {
        File expected = new File(home, "z", 30, localTime);
        File actual = new File(home, "z", 30, localTime);
        assertTrue(expected.equals(actual));
    }

}
