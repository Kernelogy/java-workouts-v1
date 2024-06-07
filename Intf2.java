interface A{
    public void methodA();
}
interface B{
    public void methodB();
}
class AB implements A, B{
    @Override
    public void methodA(){
        System.out.println("Method A");
    }
    @Override
    public void methodB(){
        System.out.println("Method B");
    }
}

public class Intf2 {
    public static void main(String[] args) {
        AB ab = new AB();
        ab.methodA();
        ab.methodB();        
    }    
}
