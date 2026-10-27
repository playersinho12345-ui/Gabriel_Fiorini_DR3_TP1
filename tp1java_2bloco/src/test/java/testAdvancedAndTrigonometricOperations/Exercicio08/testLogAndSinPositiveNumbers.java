package testAdvancedAndTrigonometricOperations.Exercicio08;

import infnet.ScientificCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testLogAndSinPositiveNumbers {

    ScientificCalculator calculadora;


    @BeforeEach
    public void setUp(){
        calculadora = new ScientificCalculator();
    }

    @Test
    public void testLog(){

        assertEquals(calculadora.log(1),0);

    }

    @Test
    public void testSin(){

        assertEquals(calculadora.sin(90),1);
    }
}
