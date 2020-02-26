import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    QuantityMeasurement qm = new QuantityMeasurement();

    @Test
    public void TestFeetGivenZero() throws Exception {
        Object result = qm.feet(0);
        assertEquals(0, (int)result);
    }

    @Test
    public void TestCheckNull() throws Exception {
        Object result = qm.feet(null);
        assertEquals("Null Value",(String) result);
    }

    @Test
    public void TestToCheckType() throws Exception {
        Object result = qm.feet(1);
        boolean b= Integer.class.isInstance(result);
        assertEquals(true,b);
    }
}