package codewithsagar.demo;


public class accmod2 {

    public int a = 10; // public access modifier
    protected int y = 20; // protected access modifier
    int z = 30; // default access modifier (package-private)
    private int b = 40; // private access modifier
    public void method1(){
        System.out.println(a);
        System.out.println(y);
        System.out.println(b);
        System.out.println(z);
    }
    public static void main(String[] args) {
        
    }
}
