public class Excep1 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);//
            System.out.println(x+y);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Two numbers needed");
        }
        System.out.println("Program Ended");
    }
}

/*
    When an execption/error occurs the program "Abruptly Terminates"

    Exception handling helps the program to exit gracefully even when the 
    excception occurs
    Syntax:
        try{
            normal-statements
        }catch(exception-obj){
            statements-if-exception-occurs
        }


 */
