package squash.tfauto;
import org.junit.jupiter.api.Test;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Data_test {
  @Test
  public void cufSuccessTest() throws ParameterException {
      String string = ParameterService.INSTANCE.getString("TC_CUF_little_success_counts");
      assertEquals("yeah, sister", string);
  }

  @Test
  public void datasetSuccessTest() throws ParameterException {
      String string = ParameterService.INSTANCE.getString("DS_CUF_little_success_counts");
      assertEquals("yeah, brother", string);
  }

  @Test
  public void envSuccessTest() throws ParameterException {
      String string = ParameterService.INSTANCE.getString("ENV_its_ok_to_fail");
      assertEquals("hell, yeah", string);
  }

  @Test
  public void cufFailTest() throws ParameterException {
      String string = ParameterService.INSTANCE.getString("TC_CUF_little_success_counts");
      assertEquals("yeah, brother", string);
  }

  @Test
  public void datasetFailTest() throws ParameterException {
      String string = ParameterService.INSTANCE.getString("DS_CUF_little_success_counts");
      assertEquals("yeah, sister", string);
  }

  @Test
  public void envFailTest() throws ParameterException {
      String string = ParameterService.INSTANCE.getString("ENV_its_ok_to_fail");
      assertEquals("heavens, yeah", string);
  }

}