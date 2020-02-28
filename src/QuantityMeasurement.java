import java.util.Scanner;

public class QuantityMeasurement
{
        public Object feet (Object feet){
            if (feet instanceof Integer) {
                int inch = 12 * (int) feet;
                return inch;
            } else {
                return "Null Value";
            }
        }

        public Object inch (Object inch){
            if (inch instanceof Integer) {
                int feet = (int) inch / 12;
                return feet;
            } else {
                return "Null Value";
            }

        }

        public Object feettoyard (Object feettoyard){

            if (feettoyard instanceof Integer) {
                int yd = (int) feettoyard / 3;
                return yd;
            } else {
                return "Enter valid Input";
            }

        }

        public Object yardtofeet (Object yardtofeet) {

            if (yardtofeet instanceof Integer) {
                int yd = 3 * (int) yardtofeet;
                return yd;
            } else {
                return "Enter valid Input";
            }
        }

        public Object yardtoinch (Object yardtoinch) {

            if (yardtoinch instanceof Integer) {
                int inch = 36 * (int) yardtoinch;
                return inch;
            } else {
                return "Enter valid Input";
            }
        }

        public Object inchtoyard (Object inchtoyard) {

            if (inchtoyard instanceof Integer) {
                int yd = (int) inchtoyard / 36;
                return yd;
            } else {
                return "Enter valid Input";
            }
        }

        public Object inchtocm (Object inchtocm) {

            if (inchtocm instanceof Double) {
                double cm = (double) inchtocm * 2.5;
                return cm;
            } else {
                return "Enter valid Input";
            }
        }

    }
