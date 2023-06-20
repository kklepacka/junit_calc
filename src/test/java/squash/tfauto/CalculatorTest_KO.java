package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator")
public class CalculatorTest {

    @Test
    public void multFailure(){
        int first = 2;
        int second = 4;
        Assertions.assertTrue((first*second)==6, "Le résultat du calcul est incorrect. " + first + " * " + second + " n'est pas égal à 6");
    }

    @Test
    @DisplayName("Mult")
    public void multDNFailure(){
        int first = 2;
        int second = 4;
        Assertions.assertTrue((first*second)==6, "Le résultat du calcul est incorrect. " + first + " * " + second + " n'est pas égal à 6");
    }

}
