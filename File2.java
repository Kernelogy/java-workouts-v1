import java.io.*;

public class File2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt"); 
            // System.out.println(fis.available());
            // System.out.println(fis.read());//reads and returns the ascii value
            // System.out.println(fis.read());//and moves to next cursor position
            // System.out.println(fis.available());

            // while(fis.available() != 0){
            //     System.out.print((char) fis.read());//type-casting int to char
            // }
            
            byte[] data = new byte[fis.available()];
            fis.read(data);
            String sData = new String(data);
            System.out.println(sData);

        } catch (Exception e) {
            e.printStackTrace();
        }       

    }
}
/*
    Binary
        InputStream/OutStream
    Character
        Reader/Writer
 */