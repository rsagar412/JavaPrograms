import java.util.Scanner;

public class ExceptionProblemset {
    public static void main(String[] args) {
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner  sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5)
        {
            try{
                System.out.println("Enter the value of index: ");
        
            index = sc.nextInt();
            System.out.println("The value is "+marks[index]);
            break;

        }catch(Exception e){
            i++;
            System.out.println("Exception Handled: " + e);
        } 
    }
    System.out.println("End of the program.");
    }
}
