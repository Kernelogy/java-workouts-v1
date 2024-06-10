enum States{
    PRESENT,
    ABSENT,
    LEAVE,
    HALFDAY
}
class Attendance{
    /*
    //the range of the passing argument cannot be determined
    public void markAttendance(int val){ 
        switch (val) {
            case 1:
                System.out.println("Present");
                break;
            case 0:
                System.out.println("Absent");
                break;
            case 2:
                System.out.println("Leave");
                break;
            case 3:
                System.out.println("Half Day");
                break;        
            default:
                break;
        }
    }
    */
    public void markAttendance(States s){
        switch (s) {
            case PRESENT:
                System.out.println("Present");
                break;
            case ABSENT:
                System.out.println("Present");
                break;
            case LEAVE:
                System.out.println("Present");
                break;
            case HALFDAY:
                System.out.println("Present");
                break;
        }
    }
}
public class Enum1 {
    public static void main(String[] args) {
        Attendance atten = new Attendance();
        // atten.markAttendance(10);
        atten.markAttendance(States.HALFDAY);
        
    }    
}
