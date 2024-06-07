class MyClass{
    int value;
}

public class Oop2 {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        mc1.value = 100;
        mc2.value = 200;
        System.out.println(mc1.value);
        System.out.println(mc2.value);
    }    
}

