import java.util.Scanner;

public class demo {
    public static void main(String[] orgs){
        int n;
        System.out.println("Enter n");
        Scanner stair = new Scanner(System.in);
        n=stair.nextInt();

        switch (n) {
            case 1:
                System.out.println("1 Step");
                break;
            case 2:
                System.out.println("1 step + 1 step");
                System.out.println("2 Steps");
                break;
            case 3:
                System.out.println("1 step + 1 step + 1 step");
                System.out.println("2 Steps + 1 Step");
                System.out.println("1 Step + 2 Steps");
                break;
            
            case 4 :
                System.out.println("1 step + 1 step + 1 step + 1 Step");
                System.out.println("2 Steps + 1 Step + 1 Step");
                System.out.println("1 Step + 2 Steps + 1 Step");
                System.out.println("1 Step + 1 Step + 2 Steps");
                System.out.println("2 Steps + 2 Steps");
                System.out.println("3 Steps + 1 Step");
                System.out.println("1 Step + 3 Steps");
                break;
            
            case 5:
                System.out.println("1 step + 1 step + 1 step + 1 Step + 1 Step");
                System.out.println("2 Steps + 1 Step + 1 Step + 1 Step");
                System.out.println("1 Step + 2 Steps + 1 Step + 1 Step");
                System.out.println("1 Step + 1 Step + 2 Steps + 1 Step");
                System.out.println("1 Step + 1 Step + 1 Step + 2 Steps");
                System.out.println("2 Steps + 3 Steps");
                System.out.println("3 Steps + 2 Steps");
                System.out.println("4 Steps + 1 Step");
                System.out.println("1 Step + 4 Steps");
                break;

            default:
                System.out.println("End");
                break;
        }
        
        
         
        
    
}
}