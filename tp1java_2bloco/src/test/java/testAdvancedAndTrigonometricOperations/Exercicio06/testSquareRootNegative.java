package testAdvancedAndTrigonometricOperations.Exercicio06;
import infnet.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testSquareRootNegative {
    @Test
    public void testSquareRootNegative() {
        ScientificCalculator calculadora = new ScientificCalculator();

        assertThrows(IllegalArgumentException.class,
                () -> {calculadora.squareRoot(-25);
        });
    }
}
