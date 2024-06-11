/*
    1. Checked Exception
    2. Unchecked Exception

    java.util
        Scanner
*/
import java.io.*;

class Excep3{
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(System.in);//Standard input device | keyboard
            System.out.print("Enter your name : ");
            String name = dis.readLine(); //throwing the checked expection IOException
                                          //without handling the exception file cannot be compiled 
            System.out.println("Welcome " + name);          
        } catch (IOException e) {
            // TODO: handle exception
        }

    }
}