import static org.junit.jupiter.api.Assertions.*;

import org.example.DigitoCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DigitoCalculatorTest {
    private DigitoCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new DigitoCalculator();
    }
    @Test
    public void testMediaDigitos() {
        assertEquals(2.5, calculator.mediaDigitos(1234), 0.01);
        assertEquals(5.0, calculator.mediaDigitos(55), 0.01);
        assertEquals(0.0, calculator.mediaDigitos(0), 0.01);
    }
    @Test
    public void testMediaDigitosNegativo() {
        assertEquals(2.5, calculator.mediaDigitos(-1234), 0.01);
    }
}

