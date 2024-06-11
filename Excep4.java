import java.io.*;

public class Excep4 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);//
            System.out.println(x+y);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Two numbers needed");
            getInput();
        }catch(NumberFormatException ne){
            System.out.println("String cannot be converted to number");
            getInput();
        }finally{
            System.out.println("This executes all the time");
        }
        System.out.println("Program Ended");
    }
    static void getInput(){
        DataInputStream dis = new DataInputStream(System.in);
        try{
            int x = Integer.parseInt(dis.readLine());
            int y = Integer.parseInt(dis.readLine());
            System.out.println(x+y);
        }catch(IOException ioe){
            System.out.println("IOException Occured");
        }
    }
}
