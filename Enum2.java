
enum Rainbow{
    VIOLET(0),
    INDIGO(1),
    BLUE(2),
    GREEN(3),
    YELLOW(4),
    ORANGE(5),
    RED(6);

    public int value;

    private Rainbow(int val){
        value = val;
    }
}

enum States{

    PRESENT(1.0),
    ABSENT(0.0),
    LEAVE(0.25),
    HALFDAY(0.5);

    public double mark = 0;
    
    private States(double m){
        mark = m;
    }  

}
public class Enum2 {
    public static void main(String[] args) {
        for (Rainbow r : Rainbow.values()) {
            System.out.println(r);
        }     
        
        for(States s : States.values()){
            System.out.println(s.mark);
        }

        Rainbow r = Rainbow.ORANGE;

        System.out.println(r + " " + r.value);
    }
}
