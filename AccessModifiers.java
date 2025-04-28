import codewithsagar.demo.*;

class c1 extends accmod2 {
    public void method2() {
        System.out.println(a); // public access modifier can be accessed from anywhere
        System.out.println(y); // protected access modifier can be accessed in subclass
        // System.out.println(z); // default access modifier cannot be accessed outside the package
        // System.out.println(b); // private access modifier cannot be accessed outside the class
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
         c1 obj = new c1();
        //  System.out.println(obj.a); // public access modifier can be accessed from anywhere
        //    obj.method1();
           obj.method2();

    }
}
