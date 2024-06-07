// - If a class contains abstract method then the class must be declared abstract
// - Abstract Class cannot be instantiated(Objects cannot be created)
// - Use of an abstract class is templating
// - When a sub class inherits an abstract class then the sub class itself becomes
//   abstract
// - To remove the abstracting in the sub class, the sub class must override
//   all the super class abstract methods
// - Abstract class can contain both defined and undefined methods
abstract class Vehicle{
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public void display(){
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("Car Started");
    }
    @Override
    public void stop(){
        System.out.println("Car Stopped");
    }
    @Override
    public void accelerate(){
        System.out.println("Car Acclerating");
    }

}

public class Abs1 {
    public static void main(String[] args) {
        // Car c = new Car();
        // c.start();        
        // c.accelerate();
        // c.stop();
        Vehicle v = new Car();
        v.start();
        v.accelerate();
        v.stop();
        v.display();
    }
    
}
