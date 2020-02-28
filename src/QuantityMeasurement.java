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
            return "Enter valid Input";
        }
    }

    public Object inch(Object inch){
        if (inch instanceof Integer)
        {
            int feet = (int) inch / 12;
            return feet;
        }
        else{
            return "Enter valid Input";
        }

    }
}
