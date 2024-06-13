import java.io.*;

public class File6 {
    public static void main(String[] args) throws Exception {
        String data = "This is the data being written to the file";
        // FileWriter writer = new FileWriter("data.txt");
        FileWriter writer = new FileWriter("data.txt", true);
        writer.write(data);
        writer.close();
    }
}
