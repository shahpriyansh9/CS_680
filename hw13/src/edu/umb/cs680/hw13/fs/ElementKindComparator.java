package edu.umb.cs680.hw13.fs;

import java.util.Comparator;

public class ElementKindComparator implements Comparator<FSElement>
{

   private int ElementKind(FSElement E)
   {
        if(E.isDirectory())
        {
            return 1;
        }
        else if(E.isFile())
        {
            return 2;
        }
        else
        {
            E.isLink();
            return 3;
        }
    }

    public int compare(FSElement E1, FSElement E2)
    {
        return ElementKind(E1) - ElementKind(E2);
    }
    
}
