package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;
import java.util.LinkedList;
 

public class Link extends FSElement
{
    private FSElement target;
    private final LinkedList<FSElement> children = new LinkedList<>();

    public Link(Directory parent, String name, int size, LocalDateTime creDateTime, FSElement target)
    {
        super(parent, name, size, creDateTime);
        this.target = target;
    }

    
    public boolean isDirectory() {
        return false;
    }

    
    public boolean isFile() {
        return false;
    }

    
    public boolean isLink() {
        return true;
    }

    public void setTarget(FSElement target)
    {
        this.target = target;
    }

    public FSElement getTarget()
    {
        return target;
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

