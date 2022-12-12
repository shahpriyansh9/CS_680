package edu.umb.cs680.hw07;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDateTime;
import java.util.LinkedList;

import edu.umb.cs680.hw07.Directory;
import edu.umb.cs680.hw07.File;

import org.junit.jupiter.api.Test;


public class DirectoryTest 
{
    //Test Fixture
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


private String[] dirToStringArray(Directory d) 
{
    String[] dirInfo = { String.valueOf(d.isDirectory()), d.getName(), String.valueOf(d.getTotalSize()),
            String.valueOf(d.getCreationTime()), String.valueOf(d.countChildren()) };
    return dirInfo;
}


//Test 1
@Test
public void verifyDirectoryName() 
{
    String expected = "root";
    String actual = root.getName();
    assertEquals(expected, actual);
}

//Test 2
@Test
public void verifyTotalSize() 
{
    int expected = 180;
    int actual = root.getTotalSize();
    assertEquals(expected, actual);
}

//Test 3
@Test
public void verifySubDirectories() 
{
    LinkedList<Directory> expected = new LinkedList<>();
    expected.add(apps);
    expected.add(lib);
    expected.add(home);
    LinkedList<Directory> actual = root.getSubDirectories();
    assertEquals(expected, actual);
}

//Test 4
@Test
public void verifyFiles() 
{
    LinkedList<File> expected = new LinkedList<>();
    expected.add(x);
    expected.add(y);
    expected.add(z);
    expected.add(a);
    expected.add(b);
    expected.add(c);
    expected.add(d);
    LinkedList<File> actual = root.getFiles();
    assertEquals(expected, actual);
}

//Test 5
@Test
public void verifyCountChildren() 
{
    int expected = 7;
    int actual = root.countChildren();
    assertEquals(expected, actual);
}

}