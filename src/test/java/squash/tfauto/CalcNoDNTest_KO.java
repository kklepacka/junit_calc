package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcNoDNTest {

    @Test
    @DisplayName("Substraction")
    public void subDNFailure(){
        int a = 5;
        int b = 10;
        Assertions.assertTrue((b-a)==0, "Le résultat du calcul est incorrect. " + b + " - " + a + " n'est pas égal à 0");
    }

    @Test
    public void subFailure(){
        int a = 5;
        int b = 10;
        Assertions.assertTrue((b-a)==0, "Le résultat du calcul est incorrect. " + b + " - " + a + " n'est pas égal à 0");
    }


}
