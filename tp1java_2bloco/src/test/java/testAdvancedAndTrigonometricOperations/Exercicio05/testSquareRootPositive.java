package testAdvancedAndTrigonometricOperations.Exercicio05;

import infnet.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testSquareRootPositive {
    @Test
    public void testSquareRootPositive() {
        ScientificCalculator calculadora = new ScientificCalculator();

        double resultado = calculadora.squareRoot(25);

        assertEquals(5.0, resultado);

    }
}
