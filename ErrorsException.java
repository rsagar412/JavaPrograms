public class ErrorsException {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are: ");
        for (int i = 1; i<=100; i++){
            if (i ==2){
                System.out.println("This is an even prime number: " + i);
            }
            else if (i%2 == 0){
                continue;
            }
            else if (i%3 == 0){
                continue;
            }
            else if (i%5 == 0){
                
                continue;
            }
            else if (i%7 == 0){
                
                continue;
            }
            else {
                System.out.println("This is a prime number: " + i);
            }
        }
        
        
    }
}
