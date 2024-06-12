import java.io.*;
import java.util.Date;

public class File11 {
    public static void main(String[] args) throws Exception {
        File file = new File("data.txt");
        // file.createNewFile();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length()+ " bytes");
        System.out.println(file.lastModified());//Linux timestamp
        Date date = new Date(file.lastModified());
        System.out.println(date);
        // file.deleteOnExit();
    }
}
/*
File
    Create
    Delete
    Study the properties of the file
    Writing data to the file
    Reading

 */