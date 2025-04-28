class myException extends Exception{
    //creating a custom exception class
    @Override
    public String toString(){
        return super.toString() + " - This is a custom exception class.";
    }

    @Override
    public String getMessage() {
       
        return super.getMessage();
    }
}

public class ExceptionClass {

    public static int dividedemo(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        int a = 5000;
        if (a<10000)
        {
             try{    
            throw new myException();
             }
             catch (myException e){
                 System.out.println("Exception Handled: " + e);
             }
        }

        try {
            dividedemo(10,0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
