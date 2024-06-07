class Bird{
    public void fly(){
        System.out.println("Bird Flying");
    }
}
class Horse{
    public void run(){
        System.out.println("Horse Running");
    }
}
interface BirdIntf{
    public void fly(Bird bird);
}
interface HorseIntf{
    public void run(Horse horse);
}

class Pegasus implements BirdIntf, HorseIntf{
    @Override
    public void fly(Bird bird){
        bird.fly();
    }
    @Override
    public void run(Horse horse){
        horse.run();
    }
}
public class Intf3 {
    public static void main(String[] args) {
        Pegasus p = new Pegasus();
        Bird bird = new Bird();
        p.fly(bird);
        Horse horse = new Horse();
        p.run(horse);    
    }
    
}
