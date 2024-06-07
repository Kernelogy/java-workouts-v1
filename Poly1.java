class Vehicle{
    public void run(){
        System.out.println("Vehicle Running");
    }
}

class Car extends Vehicle{
    //Shadowing | Overriding => redefining the super class method in sub class
    @Override  // Anotation or Decoration
    public void run(){
        System.out.println("Car Running");
    }
}

class Cycle extends Vehicle{
    @Override
    public void run(){
        System.out.println("Cycle Running");
    }
}

public class Poly1 {
    public static void main(String[] args) {
    //    Vehicle v = new Vehicle();
    //    v.run();
    //    Car c = new Car();
    //    c.run(); 
    // super class reference = sub class object
        Vehicle v = new Car();
        v.run();
        v = new Cycle();
        v.run();

        // Assigning sub class object to super class reference is not possible
        // Car c = new Vehicle();  | Error
        
    }
}
