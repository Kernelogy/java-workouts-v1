class MyClass{
    // MyClass(){} // default constructor
    private MyClass(){
        System.out.println("Object Created");
    }
}

class Student{
    //global variables
    String name;
    int age;
    Student(String n, int a){//local variables
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(name + " " + age);
    }
}



public class Oop3 {
    public static void main(String[] args) {
        //class_name obj_name = new constructor_call()
        MyClass mc = new MyClass();  

        Student s = new Student("Mukil", 24);
        // s.name = "Mukilan";
        // s.age = 24;
        s.display();      
    }    
}
/*


 1. Object can created if and only if the constructor is 
    called along with keyword new
 2. The statements which are to be executed while creating 
    an object can be defined inside a construtor
 3. With the help of the constructors creating objects can be checked/locked
        Singleton Factory [Design Principle]
        Only one object is created for that class
 */
