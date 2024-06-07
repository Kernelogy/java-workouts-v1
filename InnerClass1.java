class Car{
    private class Engine{
        void startEngine(){
            System.out.println("Engine Started");
        }
        void stopEngine(){
            System.out.println("Engine Stopped");
        }
    }

    private Engine e = new Engine();

    public void startCar(){
        System.out.println("Car Started");
        e.startEngine();
    }
    public void stopCar(){
        System.out.println("Car Stopped");
        e.stopEngine();
    }
}

public class InnerClass1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
        c.stopCar();
        

    }
    
}
        //Inner Class obj can oly be created when it is not private
        //Creating inner class object
        // superclass.subclass ref = superclass-obj.new subclass-constructor()
        // Car.Engine e = c.new Engine();
        // e.startEngine();
        // e.stopEngine();
