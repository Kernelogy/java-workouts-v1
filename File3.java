import java.io.*;

public class File3 {
    public static void main(String[] args) throws Exception {
        String data = "This is a demo";
        // FileOutputStream fos = new FileOutputStream("data.txt"); //Overwrites the existing data
        FileOutputStream fos = new FileOutputStream("data.txt", true);//Appends the data
        // for(char ch : data.toCharArray()){
        //     fos.write(ch);
        // }
        fos.write(data.getBytes());
        fos.close();
    }
}
