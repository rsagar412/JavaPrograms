// //method overriding in java
// //Method overriding is a feature in Java that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.


// class A{
//     public int a;
//     public int method1(){
//         System.out.println("Sagar from class A");
//         return 0;
//     }
//     public void method2(){
//        System.out.println("Method 2 from class A");
//     }

// }
// class B extends A{
//     public void method3(){
//         System.out.println("Method 3 from class B");
//     }
//     public void method2(){
//         System.out.println("Method 2 from class B");
//     }
// }
public class MethodOverriding {
    public static void main(String[] args) {
        // A a = new A();
        // a.method2();
        // B b = new B();
        // b.method2();
        Animal obj = new Dog(); // Upcasting
        obj.sound();
    }
     }


class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override    //following method is overridden and it must be the same as the parent class method
    void sound(){
        System.out.println("Dog barks // this is overridden method from the current Dog class");
    }
}

