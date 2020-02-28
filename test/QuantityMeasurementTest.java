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

    @Test
    public void TestToCheckInchValueEquality() throws Exception {
        Object result = qm.inch(24);
        assertEquals(2,(int) result);
    }

    @Test
    public void TestToCheckZeroFeetAndInchReturnEqual() throws Exception {
        Object result = qm.feet(0);
        Object result2 = qm.inch(0);
        assertEquals((int) result2,(int) result);
    }

    @Test
    public void TestToCheck1FeetNotEqualTo1Inch() throws Exception {
        Object result = qm.feet(1);
        assertNotEquals(1, (int) result);
    }

    @Test
    public void TestToCheck1InchNotEqualTo1Feet() throws Exception {
        Object result = qm.feet(1);
        assertNotEquals(1, (int) result);
    }

    @Test
    public void TestToCheck1FeetEqualTo12inch() throws Exception {
        Object result = qm.feet(1);
        assertEquals(12, (int) result);
    }

    @Test
    public void TestToCheck12InchEqualTo1Feet() throws Exception {
        Object result = qm.inch(12);
        assertEquals(1, (int) result);
    }

    @Test
    public void TestToCheck3ftEqualTo1yd() throws Exception {
        Object result = qm.feettoyard(3);
        assertEquals(1, (int) result);
    }

    @Test
    public void TestToCheck1ftNotEqualTo1yd() throws Exception {
        Object result = qm.feettoyard(1);
        assertNotEquals(1, (int) result);
    }


    @Test
    public void TestToCheck1ydEqualTo3Feet() throws Exception {
        Object result = qm.yardtofeet(1);
        assertEquals(3, (int) result);
    }

    @Test
    public void TestToCheck36inchEqualTo1yd() throws Exception {
        Object result = qm.inchtoyard(36);
        assertEquals(1, (int) result);
    }

    @Test
    public void TestToCheck1inchNotEqualTo1yd() throws Exception {
        Object result = qm.inchtoyard(1);
        assertNotEquals(1, (int) result);
    }


    @Test
    public void TestToCheck1ydEqualTo36inch() throws Exception {
        Object result = qm.yardtoinch(1);
        assertEquals(36, (int) result);
    }


}
