import java.util.ArrayList;
import java.util.TreeSet;

class Student{
    private String name;
    private int age;
    public Student(String n, int a){
        name = n;
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
}
public class Col3 {
    public static void main(String[] args) {
        Student s1 = new Student("Mukil", 23);
        Student s2 = new Student("Anbu", 34);
        Student s3 = new Student("Maun", 25);
        //List can handle all the objects/types
        ArrayList<Student> sList = new ArrayList<Student>();
        // Set cannot handle all the objects expcept the wrapper classes
        // As the Set doesnot know how to sort the problem arises
        // if we need to handle our objects are type extra implementation needed
        // TreeSet<Student> sList = new TreeSet<Student>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        for (Student student : sList) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
