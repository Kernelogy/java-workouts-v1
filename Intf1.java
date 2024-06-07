/*
 Interface 
    pure abstract class
    Interface can contain only abstract methods

    access-specifier interface class_name{

    }

    class sub_class_name implements interface_name{

    }

 */

 //Hiding the implementation
 
interface Car{
    public void start();
    public void stop();
    public void accelerate();
}

class InnovaCar implements Car{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
    @Override
    public void stop(){
        System.out.println("Car Stoped");
    }
    @Override
    public void accelerate(){
        System.out.println("Car Accelrating");
    }
}


public class Intf1 {
    public static void main(String[] args) {
        // InnovaCar ic = new InnovaCar();
        Car ic = new InnovaCar();
        ic.start();
        ic.stop();
        ic.accelerate();
    }
}
