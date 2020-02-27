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
    public void TestCheckFeetNull() throws Exception {
        Object result = qm.feet(null);
        assertEquals("Null Value",(String) result);
    }

    @Test
    public void TestToCheckFeetType() throws Exception {
        Object result = qm.feet(1);
        boolean b= Integer.class.isInstance(result);
        assertEquals(true,b);
    }

    @Test
    public void TestToCheckFeetValueEquality() throws Exception {
        Object result = qm.feet(2);
        assertEquals(24,(int) result);
    }


    @Test
    public void TestCheckInchNull() throws Exception {
        Object result = qm.inch(null);
        assertEquals("Null Value", (String) result);
    }

    @Test
    public void TestToCheckInchType() throws Exception {
        Object result = qm.inch(1);
        boolean b= Integer.class.isInstance(result);
        assertEquals(true,b);

    }

}