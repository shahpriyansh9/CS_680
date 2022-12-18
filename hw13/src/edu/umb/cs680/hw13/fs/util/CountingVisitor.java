package edu.umb.cs680.hw13.fs.util;

import edu.umb.cs680.hw13.fs.FSVisitor;
import edu.umb.cs680.hw13.fs.Directory;
import edu.umb.cs680.hw13.fs.File;
import edu.umb.cs680.hw13.fs.Link;

public class CountingVisitor implements FSVisitor
{
    
    


    private int dirNum = 0;
    private int fileNum = 0;
    private int linkNum = 0;

    
    public void visit(Link link) 
    {
        linkNum++;
        
    }

    
    public void visit(Directory dir) 
    {
        dirNum++;
        
    }

    
    public void visit(File file) 
    {
        fileNum++;
        
    }

   
    
}
