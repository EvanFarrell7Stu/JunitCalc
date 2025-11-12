package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {
    Calculator calc;

@BeforeEach
    public void setup(){
        calc= new Calculator();
    }
@Test
    public void testAdd_Success(){

    assertEquals(20, calc.add(16,4));
    }
@Test
    public void testAdd_Fail(){

    Exception ex= assertThrows(ArithmeticException.class, ()->calc.add(Integer.MAX_VALUE, 1));
            assertEquals("Number too large", ex.getMessage());
    }
}
