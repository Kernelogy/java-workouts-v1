class Car{
    String color;
    int fuellevel;
    int speed;
    void start(){
        System.out.println("Car Started");
        speed++;
        fuellevel--;
    }
    void stop(){
        System.out.println("Car Started");
        speed = 0;
    }
    void gear(){
        System.out.println("Gear Changed");
        fuellevel--;  
    }
    void accelerate(){
        System.out.println("Car Accelerated");
        speed++;
        fuellevel--;
    }
    void brake(){
        System.out.println("Car braked");
        speed--;
    }
}

//The class which contain the main method is the executable class
//Class is the compilation module
//because when we compile a java program class files are created 

class Oop1{
    public static void main(String[] args) {
        // A class is collection of objects
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        Car c4;         // Creating a reference for an object
        c4 = new Car(); // Assigning the reference to an object

        c1.start();
        c1.accelerate();
        c1.brake();
        c1.stop();
    }
}