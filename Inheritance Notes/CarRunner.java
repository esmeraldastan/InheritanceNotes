
/**
 * Write a description of class CarRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarRunner{
    public static void goForADrive(){
        KeylessCar wiebeMobile = new KeylessCar(6);
        wiebeMobile.turnOnEngine();
        //wiebeMobile.moveForward();
        //wiebeMobile.hjump(5);
        wiebeMobile.reverse();
        wiebeMobile.turnOffEngine();
    }
        
 
}
