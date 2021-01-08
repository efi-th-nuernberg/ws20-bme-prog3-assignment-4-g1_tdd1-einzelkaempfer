import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test
    testValidEquilateral(){

        float a = 3;
        float b = 3;
        float c = 3;

        //Act

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
      
      // Assert
      assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type)
    }
    @Test
    testValidIsosceles(){

        float a = 5;
        float b = 5;
        float c = 2;

        //Act

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
      
      // Assert
      assertEquals(TriangleChecker.TriangleType.ISOSCELES, type)
    }

    @Test
    testNoTriangle(){

        float a = -5;
        float b = 1;
        float c = 4;

        //Act

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
      
      // Assert
      assertEquals(TriangleChecker.TriangleType.NONE, type)
    }

    @Test
    testOneSideZero(){

        float a = 0;
        float b = 7;
        float c = 7;

        //Act

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
      
      // Assert
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle(a, b, c))
    }
}
