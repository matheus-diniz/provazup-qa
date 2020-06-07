import br.com.diniz.provazup.helpers.DriverHelper;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/features"},
        tags = {"@ProvaZup"})
public class Runner {
    @AfterClass
    public static void cleanUp(){
        DriverHelper.getDriver().quit();
    }
}
