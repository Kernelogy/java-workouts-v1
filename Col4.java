import java.util.ArrayList;
import java.util.TreeSet;

class Student implements Comparable<Student>{
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
    @Override
    public int compareTo(Student s) {
        //Sort by Age/Int
        // return s.getAge();
        
        //Sort by Name/String
        String localName = s.getName();
        return name.compareTo(localName);
    }
}
public class Col4 {
    public static void main(String[] args) {
        Student s1 = new Student("Mukil", 23);
        Student s2 = new Student("Anbu", 34);
        Student s3 = new Student("Manu", 25);
        TreeSet<Student> sList = new TreeSet<Student>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);

        for (Student student : sList) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
