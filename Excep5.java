import java.util.*;
/*
 1. Define your own Exception class by inheriting one of predefined
    Exception Classes
 2. Catch any of the predefined exception and throw your exception object
        throw new MyException()
 3. if a method is throwing an exception object using the above syntax
    then the method must declared throws
        public void get() throws MyException
 */

class MyException extends Exception{
    MyException(){
        System.out.println("My Exception Occured");
    }
}
class Input {
    public void get() throws MyException{
        try {
            Scanner scanner = new Scanner(System.in);
            int x = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            //if NumberFormatException occurs then throw MyException
            throw new MyException();
        }

    }
}
public class Excep5 {
    public static void main(String[] args) {
        Input in = new Input();
        try {
            in.get();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
