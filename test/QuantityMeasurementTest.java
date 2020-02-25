import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    @Test
    public void Testfeetvalue() throws Exception {
        QuantityMeasurement qm = new QuantityMeasurement();
        int feet = 0;
        int result = qm.FeetToInch(feet);
        assertEquals(0, result);
    }
}