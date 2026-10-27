package testBasicOperations.Exercicio07;

import infnet.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testDivideByZero {

    @Test
    void testDivideByZero() {

        ScientificCalculator calculadora = new ScientificCalculator();

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(10, 0);
        });
    }

}

