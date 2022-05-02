import static org.junit.Assert.*;
import org.junit.*;

public class Demo1Test {
    @Test
    public void multTest(){
        assertEquals(10,Demo1.multiply(2, 5));
    }
}
