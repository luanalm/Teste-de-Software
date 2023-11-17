public import org.junit.Test; 
import static org.junit.Assert.assertEquals; 

public class CalculatorTest { 
    @Test 
    public void testAdd() { 
        Calculator calculator = new Calculator(); 
        int result = calculator.add(3, 4); 
        assertEquals(7, result); 
    } 

        @Test 
    public void testSubtract() { 
        Calculator calculator = new Calculator(); 
        int result = calculator.subtract(7, 3); 
        assertEquals(7, result); 
    }
}
