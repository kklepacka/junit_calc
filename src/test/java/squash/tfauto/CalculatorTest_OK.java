package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator")
public class CalculatorTest_OK {

    @Test
    public void addSuccess(){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17, "Le résultat du calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

    @Test
    @DisplayName("Addition")
    public void addDNSuccess(){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17, "Le résultat du calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

}
