package edu.umb.cs680.hw15.fs;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

   
public class Directory extends FSElement
{   
    
    private LinkedList<FSElement> children = new LinkedList<>();


        public Directory(Directory parent, String name, int size, LocalDateTime creationTime)
        {
            super(parent, name, size, creationTime);
            this.children = new LinkedList<>();
        }

 

    public void appendChild(FSElement child)
    {
        this.children.add(child);
        child.setParent(this);
        Collections.sort(this.children, (FSElement E1, FSElement E2) -> E1.getName().compareTo(E2.getName()));
    }

    
    public LinkedList<FSElement> getChildren()
    {
        Collections.sort(this.children, (FSElement E1, FSElement E2) -> E1.getName().compareTo(E2.getName()));
        return this.children;

    }

    public int countChildren()
    {
        return this.children.size();
    }

    public int getTotalSize()
    {
        int totalsize = 0;
        for(FSElement fsElement : children)
        {
            if(fsElement.isDirectory())
            {
                totalsize += ((Directory)fsElement).getTotalSize();
            }
            else
            {
                totalsize += fsElement.getSize();
            }
        }
        return totalsize;
    }

       
    public LinkedList<Directory> getSubDirectories()
    {
        LinkedList<Directory> SubDirectory = new LinkedList<>();

        for(FSElement fsElement : children)
        {
            if(fsElement.isDirectory())
            {
                SubDirectory.add((Directory) fsElement);
            }
        }
        Collections.sort(SubDirectory, (FSElement E1, FSElement E2) -> E1.getName().compareTo(E2.getName()));
        return SubDirectory;
    }

    public LinkedList<File> getFiles()
    {
        LinkedList<File> files = new LinkedList<>();

        for(FSElement fsElement : children)
        {
            if(!fsElement.isDirectory())
            {
                files.add((File)fsElement);
            }
        }
        Collections.sort(files, (FSElement E1, FSElement E2) -> E1.getName().compareTo(E2.getName()));
        return files;
    }

    public LinkedList<Link> getLinks()
    {
        LinkedList<Link> links = new LinkedList<>();
        for(FSElement fsElement: children)
        {
            if(!fsElement.isLink())
            {
                Link link = (Link)fsElement;
                links.add(link);
            }
        }
        return links;
    }
    
    public LinkedList<FSElement> getChildren(Comparator<FSElement> comparator)
    {
        Collections.sort(this.children, comparator);
        return this.children;
    }
    
    public LinkedList<Directory> getSubDirectories(Comparator<FSElement> comparator)
    {
        LinkedList<Directory> SubDirectory = getSubDirectories();
        Collections.sort(SubDirectory, comparator);
        return SubDirectory;
    }
    
    
    public LinkedList<File> getFiles(Comparator<FSElement> comparator)
    {
        LinkedList<File> files = getFiles();
        Collections.sort(files, comparator);
        return files;
    }
    
     
    
    public void accept(FSVisitor v)
    {
        v.visit(this);
        for (FSElement e: children)
        {
            e.accept(v);
        }
    }

    public boolean isDirectory()
    {
        return true;
    }
    
    public boolean isFile() 
    {
               return false;
    }
    
    public boolean isLink() 
    {
                return false;
    }


    
}