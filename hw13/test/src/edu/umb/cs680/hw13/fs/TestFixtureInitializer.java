package edu.umb.cs680.hw13.fs;


import java.time.LocalDateTime;



public class TestFixtureInitializer 
{
    public  FileSystem createFileStructure()
    {
        Directory root = new Directory(null, "root",0, LocalDateTime.now() );

        Directory home = new Directory(root, "home" , 0 , LocalDateTime.now());
        Directory bin = new Directory(root, "lib", 0 , LocalDateTime.now());
        Directory Apps = new Directory(root, "Apps", 0 , LocalDateTime.now());

        File x = new File(Apps, "x" , 7 , LocalDateTime.now());

        File y = new File(bin, "y", 6 , LocalDateTime.now());


        Directory pictures = new Directory(home, "pictures", 0 , LocalDateTime.now());
        File c = new File(home, "c" , 1 , LocalDateTime.now());
        
        File a = new File(pictures, "a" , 3 , LocalDateTime.now());
        File b = new File(pictures, "b" , 2 , LocalDateTime.now());



        Link d = new Link(root,"d",4, LocalDateTime.now(),pictures);
        Link e = new Link(root,"e",5, LocalDateTime.now(),x);


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

        FileSystem HW13 = FileSystem.getFileSystem(); 
        HW13.appendRootDir(root);
        return HW13;
   }
}
