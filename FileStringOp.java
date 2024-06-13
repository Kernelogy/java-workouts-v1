import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStringOp {
    public static void main(String[] args) throws Exception{
        String inputFile = "data.txt";
        String find = "file";
        String replace = "data";
        //Reading
        FileInputStream fis = new FileInputStream(inputFile);
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String sData = new String(data);
        System.out.println(sData); 
        
        
        String replacedString = sData.replaceAll(find, replace);


        //Writing
        FileOutputStream fos = new FileOutputStream(inputFile);
        fos.write(replacedString.getBytes());

        fis.close();
        fos.close();

    }

}
