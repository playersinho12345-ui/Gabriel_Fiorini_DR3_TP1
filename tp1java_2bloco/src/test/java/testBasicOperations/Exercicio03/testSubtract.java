package testBasicOperations.Exercicio03;

import infnet.ScientificCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testSubtract {

    @Test
    public void testSubtract() {

        // 1. SETUP: prepara o objeto que será testado
        ScientificCalculator calculadora = new ScientificCalculator();

        // 2. EXECUTION: executa o method subtract
        double resultado = calculadora.subtract(5, 3);

        // 3. ASSERTION: verifica se o resultado é o esperado
        assertEquals(2.0, resultado);

        // 4. TEARDOWN: não é necessário neste teste, pois não é necessário que feita a redefinição ou
        // limpeza dos recursos utilizados
    }
}
