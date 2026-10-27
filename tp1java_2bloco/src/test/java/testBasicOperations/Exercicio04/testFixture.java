package testBasicOperations.Exercicio04;

import infnet.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testFixture {

    ScientificCalculator calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new ScientificCalculator();
    }

    @Test
    void testAddition() {
        double resultado = calculadora.add(5, 3);

        assertEquals(8.0, resultado);
    }

    @Test
    public void testSubtract() {
        double resultado = calculadora.subtract(5, 3);

        assertEquals(2.0, resultado);
    }
}