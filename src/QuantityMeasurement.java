import java.util.Scanner;

public class QuantityMeasurement
{
    public Object feet(Object feet){
        if (feet instanceof Integer)
        {
            return (int) feet;
        }
        else {
            return "Null Value";
        }
    }
}
