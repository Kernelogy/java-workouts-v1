/*
Encapsulation
    Hiding the data member 
    and providing methods to access the data members
        getter | setter 

POJO Class
    Plain Old Java Object

 */
class Car{
    private int speed;
    void accelerate(){
        speed++;
    }
}

 class Student{
    private String name;  
    private int age; 
    public void setName(String n){  // setter
        name = n;
    }
    public String getName(){       //  getter
        return name;
    }
    public void setAge(int a){     //  setter
        age = a;
    }
    public int getAge(){           //  getter
        return age;
    }
 }

 class Encap1{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Mukil");
        s.setAge(34);
        System.out.println(s.getName() + " " + s.getAge());
    }
 }