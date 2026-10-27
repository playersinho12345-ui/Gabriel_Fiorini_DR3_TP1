package testBasicOperations.Exercicio02;

import infnet.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testAddition {

    @Test
    void testAddition() {
        ScientificCalculator calculadora = new ScientificCalculator();

        double resultado = calculadora.add(5, 3);

        assertEquals(8.0, resultado);
    }
}
