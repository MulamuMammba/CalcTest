import org.junit.Test;
import org.mammba.Calculator;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void add(){
        //Arrange
        int a = 0, b = 0,c = 0;

        //Act
        a= calc.add(1,2);
        b = calc.add(-1,-1);
        c = calc.add(1,2,3,4,5);

        //Assert
        assertEquals(3,a);
        assertEquals(-2,b);
        assertEquals(15,c);

    }

    @Test
    public void multiply(){
        //Arrange
        int a = 0, b = 0,c = 0;

        //Act
        a= calc.multiply(1,3);
        b = calc.multiply(-1,3);
        c = calc.multiply(1,2,3,4,5);

        //Assert
        assertEquals(3,a);
        assertEquals(-3,b);
        assertEquals(120,c);

    }
}
