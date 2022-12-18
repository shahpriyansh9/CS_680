package edu.umb.cs680.hw13.fs;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Comparator;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class FileSystemTest 
{
    TestFixtureInitializer TFS = new TestFixtureInitializer();
    FileSystem FS = TFS.createFileStructure();

    

    @Test
    public void sortByAlphabeticalTest()
    {
        Comparator<FSElement> comp = new AlphabeticalComparator();
        LinkedList<FSElement> expected = FS.getRootDirs();
        expected.sort(comp);
        LinkedList<FSElement> actual = FS.getRootDirs();
        assertEquals(actual,expected);
    }

    @Test
    public void sortByElementKindTest()
    {
        Comparator<FSElement> comp = new ElementKindComparator();
        LinkedList<FSElement> expected = FS.getRootDirs();
        expected.sort(comp);
        LinkedList<FSElement> actual = FS.getRootDirs();
        assertEquals(actual,expected);
    }

    @Test
    public void sortByReverseAlphabeticalTest()
    {
        Comparator<FSElement> comp = new ReverseAlphabeticalComparator();
        LinkedList<FSElement> expected = FS.getRootDirs();
        expected.sort(comp);
        LinkedList<FSElement> actual = FS.getRootDirs();
        assertEquals(actual,expected);
    }

    @Test
    public void sortByTimeStampTest()
    {
        Comparator<FSElement> comp = new TimeStampComparator();
        LinkedList<FSElement> expected = FS.getRootDirs();
        expected.sort(comp);
        LinkedList<FSElement> actual = FS.getRootDirs();
        assertEquals(actual,expected);
    }
}