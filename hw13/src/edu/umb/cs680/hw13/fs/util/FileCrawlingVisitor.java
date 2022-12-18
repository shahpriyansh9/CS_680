package edu.umb.cs680.hw13.fs.util;

import java.util.LinkedList;

import edu.umb.cs680.hw13.fs.Directory;
import edu.umb.cs680.hw13.fs.FSVisitor;
import edu.umb.cs680.hw13.fs.File;
import edu.umb.cs680.hw13.fs.Link;

public class FileCrawlingVisitor implements FSVisitor
{
    private LinkedList<File> files = new LinkedList<>();
    
    
    public void visit(Link link) 
    {
        return;
    }

    public void visit(Directory dir) 
    {
        return;
    }

    public void visit(File file) 
    {
        files.add(file);
    }

    public LinkedList<File> getFiles()
    {
        return files;
    }
    

    
}
