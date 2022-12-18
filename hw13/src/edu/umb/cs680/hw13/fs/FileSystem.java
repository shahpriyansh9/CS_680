package edu.umb.cs680.hw13.fs;

import java.util.LinkedList;

public abstract class FileSystem 
{
    protected String name;
    protected int capacity;
    protected int id;
    private LinkedList<FSElement> rootdirs = new LinkedList<>();

    


    public FSElement Init(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;

        FSElement root = createDefaultRoot();
        if(root.isDirectory() && capacity >= root.getSize())
        {
            setRoot(root);
            this.id = root.hashCode();
            return root;
        }
        else
        {
            return null;
        }
  
    }

    protected abstract FSElement createDefaultRoot();
    
    protected void setRoot(FSElement root)
    {
        rootdirs.add(root);
    }

    protected int getId()
    {
        return id;
    }

    protected LinkedList<FSElement> getRootDirs()
    {
        return rootdirs;
    }
    
    protected int capacity()
    {
        return capacity;
    }

    public static FileSystem getFileSystem() 
    {
        return new FileSystem() 
        {
            @Override
            protected FSElement createDefaultRoot() {
                return null;
            }
        };
    }

    public void appendRootDir(FSElement root) 
    {
        this.rootdirs.add(root);
    }
    
}
