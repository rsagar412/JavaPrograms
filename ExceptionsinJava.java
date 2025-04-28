public class ExceptionsinJava {
    
    public static void main(String[] args) {
        
        int a = 5000;
    int b = 0;
    // int result = a/b;
    // System.out.println(result);

    try
    {
        int result = a/b;
    }
    catch(Exception e){
        System.out.println("Exception Handled: " + e);

    }
    
    System.out.println("This is the end of the program.");
}
    
    
}
