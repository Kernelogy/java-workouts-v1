public class Excep2 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        // try{
        //     int x = Integer.parseInt(args[0]);
        //     int y = Integer.parseInt(args[1]);//
        //     System.out.println(x+y);
        // }catch(ArrayIndexOutOfBoundsException ae){
        //     System.out.println("Two numbers needed");
        // }catch(NumberFormatException ne){
        //     System.out.println("String cannot be converted to number");
        // }finally{
        //     System.out.println("This executes all the time");
        // }
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);//
            System.out.println(x+y);
        }catch(Exception ae){
            System.out.println("This part executes on all Exceptions ");
            // System.out.println(ae.getMessage());
            ae.printStackTrace();
        }finally{
            System.out.println("This executes all the time");
        }
        System.out.println("Program Ended");
    }
}
