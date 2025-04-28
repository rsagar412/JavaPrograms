package JavaFolder.polymorphismdemo;
interface  camera{
    void takeSnap();
     void recordVideo();
     default void record4KVideo() {
         System.out.println("Recording in 4K...");
         greet();
     }
     private void greet() {
         System.out.println("Hello, welcome to the camera interface! This is a private method.");
     }
 } 
 
 interface wifi extends camera{
     
     void connectToNetwork();
     String [] getNetworks();
 }
 
 class MyCellPhone{
     void callNumber(int phoneNumber) {
         System.out.println("Calling " + phoneNumber);
     }
     void pickCall() {
         System.out.println("Connecting...");
     }
 }
 
 class SmartPhone extends MyCellPhone implements camera, wifi {
     public void takeSnap() {
         System.out.println("Taking snap from smartphone...");
     }
     public void recordVideo() {
         System.out.println("Recording video from smartphone...");
     }
     public String[] getNetworks() {
          String[] networkList = {"Network1", "Network2", "Network3"};
          return networkList;
     }
     public void connectToNetwork(){
         System.out.println("Connecting to network...");
     }
     public void demomethod() {
         System.out.println("This is a demo method in SmartPhone class.");
     }
 }
 

public class polymorphisminjava {
    public static void main(String[] args) {
        camera cam = new SmartPhone();    // Upcasting to camera interface, can be used to call camera methods only, since the reference type is camera and object is SmartPhone.
        cam.takeSnap();
        cam.record4KVideo();
        // cam.pickCall(); // This will not work as pickCall() is not part of the camera interface
    }
}
