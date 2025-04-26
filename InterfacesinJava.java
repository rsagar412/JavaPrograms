//interfaces in java is just like a class but it can only contain abstract methods and final variables.
// It cannot contain concrete methods.

// interface Bicycle{
//     int num = 1;    // by default final and static
//     void applyBrake(int decrement);
//     void speedUp(int increment);
// }

// class Hero implements Bicycle{
//    int speed = 7;
//    public void applyBrake(int decrement){
//        speed = speed - decrement;
//    }
//    public void speedUp(int increment){
//        speed = speed + increment;
//    }
//    void printSpeed(){
//        System.out.println("Current speed is: " + speed);
//    }
// }


interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show2() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show(); // Or B.super.show()
    }
}

class D implements A, B {
    // @Override
    public void show() {
        System.out.println("This is class D."); // Or B.super.show()
        // B.super.show();
    }
}


public class InterfacesinJava {
  public static void main(String[] args) {
    C c = new C();

c.show();

B b = new D();
b.show2();

    // Hero h = new Hero();
    // h.speedUp(10);
    // h.printSpeed();
  }

}

