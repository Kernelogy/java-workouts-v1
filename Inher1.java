/*
    Inheritance
        Transfroming the characteristics of a parent to a child
        Parent  => Super Class
        Child   => Sub Class

        class sub_class extends super_class{

        }

        Types
            Single
                A => B
            Multilevel (chain of single inheritance)
                A => B => C .....
            Hierarchical
                    |=>AB
                A   |
                    |=>AC
                    .
                    .
            Multiple
                A=>
                    |=> AB
                B=>
            Hybrid
                    |=>AB
                A   |       |=>ABC
                    |=>AC


                A=>        |  => AAB
                    |=> AB |
                B=>        |  => BAB

            Java Supports Only single inheritance
            Java doesnt supports inheritance



*/
class Monkey{
    public void stand(){
        System.out.println("A Monkey can stand");
    }
}
class Human extends Monkey{
    public void think(){
        System.out.println("A Human can think");
    }
}
public class Inher1 {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.stand();
        // m.think(); super class object cannot access sub class method | error
        Human h = new Human();
        h.stand();
        h.think();
    }
    
}
