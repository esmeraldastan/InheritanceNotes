
/**
 * Write a description of class KeylessCar here.
 * 
 * @author Esmeralda Lopez
 * @version (a version number or a date)
 */
public class KeylessCar extends Car{
    public KeylessCar(int windows){
        super(windows);
    }
    public void turnOnEngine(){
        System.out.println("You press the start engine button. The engine starts");
    }
    public void turnOffEngine(){
        System.out.println("You press the start engine button. The engine turns off ");
    }
}

