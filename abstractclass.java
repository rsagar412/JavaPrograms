abstract class Parent2 {

    Parent2(){
        System.out.println("Base class constructor");}

        public void sayHello(){
            System.out.println("Hello from base class");}
        
        abstract public void greet();
}

class Child2 extends Parent2{
@Override
    public void greet(){
        System.out.println("Good Morning from child class");}
}

public class abstractclass {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.greet();
        Parent2 p = new Child2();

        p.sayHello(); // This will call the method from the parent class
    }
    
}
