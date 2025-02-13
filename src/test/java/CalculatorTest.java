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
    @Test
    public void subtract(){
        //Arrange
        int a = 0, b = 0,c = 0;

        //Act
        a= calc.multiply(1,3);
        b = calc.multiply(-1,3);
        c = calc.multiply(20,1,2,3,4,5);

        //Assert
        assertEquals(-2,a);
        assertEquals(-4,b);
        assertEquals(5,c);

    }
    @Test
    public void divide(){
        //Arrange
        int a = 0, b = 0,c = 0;

        //Act
        a= calc.multiply(3,3);
        b = calc.multiply(15,3);
        c = calc.multiply(500,-10,5,2);

        //Assert
        assertEquals(1,a);
        assertEquals(5,b);
        assertEquals(-5,c);

    }
}
