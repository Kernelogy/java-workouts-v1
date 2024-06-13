import java.io.*;

public class File4 {
    public static void main(String[] args) throws Exception{
        /*
        FileReader reader = new FileReader("data.txt");
        
        int ch = 0;
        do{
            ch =  reader.read();//reads and returns the data in ascii format and 
                                //move the next cursor position
            System.out.print((char) ch);
        }while(ch != -1);  //-1 denotes the file end
        */
        File file = new File("data.txt");
        FileReader reader = new FileReader(file);
        char[] data = new char[(int) file.length()];
        reader.read(data);
        String sData = new String(data);
        System.out.println(sData);
    }
}
