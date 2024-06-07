interface Intf {
    //A variable inside an interface must be assigned with a value
    // because all the variables decalred inside an interface are
    // final by default
    public int num = 100;
    public void method();
}
class MyClass{
    // Final variables are constants
    // So constants must be assigned a value while declaring
    final int x = 100;
}
public class Anonynmous1 {
    public static void main(String[] args) {
        Intf i = new Intf() {
            @Override
            public void method(){
                System.out.println("Anonymous Implementation");
            }
        };

        i.method();

        MyClass mc = new MyClass();
        mc.x = 1000;

    }
}
