class Vehicle{
    public void run(){
        System.out.println("All Vehicles runs");
    }
}
class Cycle extends Vehicle{
    public void peddle(){
        System.out.println("Cycles runs on peddaling");
    }
}
class Car extends Vehicle{
    public void accelerate(){
        System.out.println("Car runs automatically on accelarating");
    }
}
public class Inher3 {
    public static void main(String[] args) {
    //    Car c = new Car();
    //    c.run();
    //    c.accelerate();
    //    Cycle cy = new Cycle();
    //    cy.run();
    //    cy.peddle();        
    }
}
