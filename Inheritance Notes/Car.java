
/**
 * Abstract class Car - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Car implements DriverlessCarRules{
    boolean seatbealtOn ;
    boolean engineOn ;
    int windows;
    public Car(int window){
        windows = window;
        seatbealtOn = false;
        engineOn = false; 
    }
    public void turnOnEngine(){
        engineOn = true;
        System.out.println("You turn the key and the engine turns on.");
    }
    public void turnOffEngine(){
        engineOn = false;
        System.out.println("You turn the key and the engine turns off.");
   
    }
    public boolean seatBeltOn(){
        seatbealtOn = true;
        System.out.println("Seatbelt is put on.");
        return true;
    }
    public void seatbeltOff(){
        seatbealtOn = false;
        System.out.println("Seatbelt is off.");
    }
    public void turnRight(){
        System.out.println("You have now made a right turn.");
    }
    public void turnLeft(){
     System.out.println("You have now made left turn.");
    }
    public void accelerate(int amt){
        System.out.println("You have now stepped on the gas pedal at "+ amt + ".");
    }
    public void reverse(){
        System.out.println("You are now backing up");
     } 
    }