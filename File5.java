import java.io.*;

public class File5 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("data.txt");
        BufferedReader bReader = new BufferedReader(reader);

        String data = null;

        do{
            data = bReader.readLine();
            System.out.println(data);
        }while(data != null);
    }
}
