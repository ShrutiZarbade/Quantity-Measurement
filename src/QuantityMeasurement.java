import java.util.Scanner;

public class QuantityMeasurement
{
    public  Object feet(Object feet){
        if (feet instanceof Integer)
        {
           int inch = 12 * (int) feet;
           return inch;
        }
        else {
            return "Null Value";
        }
    }

    public Object inch(Object inch){
        if (inch instanceof Integer)
        {
            return 0;
        }
        else{
            return "Null Value";
        }
    }
}
