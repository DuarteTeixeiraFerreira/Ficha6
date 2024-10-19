import org.junit.jupiter.api.Test;
import org.example.Ex3;

import static org.junit.jupiter.api.Assertions.*;

public class Ex3Test {
    @Test
    public void testAreaCaso1() {
        Ex3 retangulo = new Ex3();
        int resultado = retangulo.area(3, 5);
        assertEquals(15, resultado);
    }

    @Test
    public void testAreaCaso2() {
        Ex3 retangulo = new Ex3();
        int resultado = retangulo.area(5, 8);
        assertEquals(40, resultado);
    }

    @Test
    public void testAreaCaso3() {
        Ex3 retangulo = new Ex3();
        int resultado = retangulo.area(2, 4);
        assertEquals(8, resultado);
    }

    @Test
    public void testPerimetroCaso1() {
        Ex3 retangulo = new Ex3();
        int resultado = retangulo.perimetro(3, 5);
        assertEquals(16, resultado);
    }

    @Test
    public void testPerimetroCaso2() {
        Ex3 retangulo = new Ex3();
        int resultado = retangulo.perimetro(5, 8);
        assertEquals(26, resultado);
    }

    @Test
    public void testPerimetroCaso3() {
        Ex3 retangulo = new Ex3();
        int resultado = retangulo.perimetro(2, 4);
        assertEquals(12, resultado);
    }

    @Test
    public void testIsTriangleTrue() {
        Ex3 retangulo = new Ex3();
        boolean resultado = retangulo.isTriangle(3, 4, 5);
        assertTrue(resultado);
    }

    @Test
    public void testIsTriangleFalse() {
        Ex3 retangulo = new Ex3();
        boolean resultado = retangulo.isTriangle(1, 2, 3);
        assertFalse(resultado);
    }
}
