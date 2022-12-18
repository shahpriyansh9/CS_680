package edu.umb.cs680.hw15.fs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.Comparator;

public class FileSystemTest 
{
    TestFixtureInitializer TFS = new TestFixtureInitializer();
    FileSystem FS  = TFS.createFileStructure();

    @Test
    public void verifyFileSystem() 
    {
        assertEquals("root", FS.getRootDirs().get(0).getName());
        assertEquals(null, FS.getRootDirs().get(0).getParent());
        assertEquals(0, FS.getRootDirs().get(0).getSize());
        assertEquals(LocalDateTime.now(), FS.getRootDirs().get(0).getCreationTime());
    }

    @Test
    public void verifyAppendRootDir()
    {
        FSElement root = FS.getRootDirs().get(0);
        FS.appendRootDir(root);
        int actual = FS.getRootDirs().size();
        int expected = 2;
        assertEquals(actual, expected);
    }
    
    
    
    @Test
    public void CapacityTest() 
    {
        int capacity = FS.capacity();
        assertEquals(capacity, 0);
    }

    @Test
    public void verifyAlphabeticalComparator() 
    {
        Comparator<FSElement> AlphabeticalComparator = (FSElement E1, FSElement E2) -> E1.getName().compareTo(E2.getName());
        assertEquals(AlphabeticalComparator.compare(FS.getRootDirs().get(0), FS.getRootDirs().get(0)), 0);
    }

    @Test
    public void verifyReverseAlphabeticalComparator() 
    {
        Comparator<FSElement> ReverseAlphabeticalComparator = (FSElement E1, FSElement E2) -> E2.getName().compareTo(E1.getName());
        assertEquals(ReverseAlphabeticalComparator.compare(FS.getRootDirs().get(0), FS.getRootDirs().get(0)), 0);
    }

    @Test
    public void verifyTimeStampComparator() 
    {
        Comparator<FSElement> TimeStampComparator = (FSElement E1, FSElement E2) -> E2.creationTime.compareTo(E1.creationTime);
        assertEquals(TimeStampComparator.compare(FS.getRootDirs().get(0), FS.getRootDirs().get(0)), 0);
    }

     @Test
    public void verifyAlphabeticalComparator2()
    {
        FSElement root = FS.getRootDirs().get(0);
        Comparator<FSElement> AlphabeticalComparator = (FSElement E1, FSElement E2) -> E1.getName().compareTo(E2.getName());
        int actual = AlphabeticalComparator.compare(root, root);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void verifyReverseAlphabeticalComparator2()
    {
        FSElement root = FS.getRootDirs().get(0);
        Comparator<FSElement> ReverseAlphabeticalComparator = (FSElement E1, FSElement E2) -> E2.getName().compareTo(E1.getName());
        int actual = ReverseAlphabeticalComparator.compare(root, root);
        int expected = 0;
        assertEquals(actual, expected);
    }

   
    
}