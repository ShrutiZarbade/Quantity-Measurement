import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    QuantityMeasurement qm = new QuantityMeasurement();

    @Test
    public void Testfeetgivenzero() throws Exception {
        Object result = qm.feet(0);
        assertEquals(0, (int)result);
    }

    @Test
    public void Testchecknull() throws Exception {
        Object result = qm.feet(null);
        assertEquals("Null Value",(String) result);
    }
}