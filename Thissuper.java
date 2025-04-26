class demo {
    int a;

    public int getA() {
        return a;
    }   
    demo(int v){
        a = v;
    }
    public int returnvalue() {
       return 1;
    }
}

public class Thissuper {
    public static void main(String[] args) {
        demo d = new demo(5);
        System.out.println(d.getA());
        System.out.println(d.returnvalue());
    }
}
