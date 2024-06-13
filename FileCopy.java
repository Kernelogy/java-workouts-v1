import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        String inputFile = args[0];
        String outputFile = args[1];
        //Reading
        FileInputStream fis = new FileInputStream(inputFile);
        byte[] data = new byte[fis.available()];
        fis.read(data);

        //Writing
        FileOutputStream fos = new FileOutputStream(outputFile);
        fos.write(data);

        fis.close();
        fos.close();


    }
}
