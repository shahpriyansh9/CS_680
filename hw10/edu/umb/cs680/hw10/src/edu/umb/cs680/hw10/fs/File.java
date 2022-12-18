package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class File extends FSElement 
{
    private final LinkedList<FSElement> children = new LinkedList<>();
    public File(Directory parent, String name, int size, LocalDateTime creationTime)
    {
        super(parent, name, size, creationTime);
        parent.appendChild(this);
    }

   
    public boolean isDirectory() {
        return false;
    }

    
    public boolean isFile() {
        return true;
    }

    
    public boolean isLink() {
        
        return false;
    }


   
    
    public void accept(FSVisitor v, SecurityContext ctx) 
    { 
        if(ctx.isActive())
        {
            v.visit(this);
            for(FSElement e: children)
            {
                e.accept(v, ctx);
            }
        }

        else
        {
            System.out.println("Error");
        }
        
        
    }


    
    
}
