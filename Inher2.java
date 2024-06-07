class A{
    public void methodA(){
        System.out.println("A Class");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("B Class");
    }
}
class C extends B{
    public void methodC(){
        System.out.println("C Class");
    }
}
// A => B => C

public class Inher2 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
        // a.methodB(); | error
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();
    }    
}
