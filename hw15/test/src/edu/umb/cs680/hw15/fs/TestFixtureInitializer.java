package edu.umb.cs680.hw15.fs;

import java.time.LocalDateTime;




public class TestFixtureInitializer 
{
    public static FileSystem createFileStructure()
    {
        Directory root = new Directory(null, "root",0, LocalDateTime.now() );

        //Sub directories of root directory
        Directory home = new Directory(root, "home" , 0 , LocalDateTime.now());
        Directory bin = new Directory(root, "lib", 0 , LocalDateTime.now());
        Directory Apps = new Directory(root, "Apps", 0 , LocalDateTime.now());

        //Children of Apps directory
        File x = new File(Apps, "x" , 9 , LocalDateTime.now());

        // Children of bin directory
        File y = new File(bin, "y", 7 , LocalDateTime.now());

        // Children of home directory
        Directory pictures = new Directory(home, "pictures", 0 , LocalDateTime.now());
        File c = new File(home, "c" , 3 , LocalDateTime.now());
        
        // Children of pictures directory
        File a = new File(pictures, "a" , 1 , LocalDateTime.now());
        File b = new File(pictures, "b" , 4 , LocalDateTime.now());


        //Creating proxies 

        Link d = new Link(root,"d",2, LocalDateTime.now(),pictures);
        Link e = new Link(root,"e",3, LocalDateTime.now(),x);


        root.appendChild(home);
        root.appendChild(bin);
        root.appendChild(Apps);
        root.appendChild(d);
        root.appendChild(e);

        Apps.appendChild(x);

        bin.appendChild(y);

        home.appendChild(pictures);
        home.appendChild(c);

        pictures.appendChild(a);
        pictures.appendChild(b);

        FileSystem HW15 = FileSystem.getFileSystem(); 
        HW15.appendRootDir(root);
        return HW15;
   }
}

