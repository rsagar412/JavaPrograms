class Base {
    public int x;
    public int y;
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    Base() {
        System.out.println("Base class constructor called");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor called");
    }
}

public class ConstructorsinInheritance 
{
    public static void main(String[] args) {
        // Base b = new Base();
        System.out.println("Base class constructor calling from Derived class");
        Derived d = new Derived();    //first the base class constructor is called, then the derived class constructor is called
    }
}
