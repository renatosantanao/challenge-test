package Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Feature/Compra.feature",
        glue = {""},
        monochrome = true,
        tags = {"@carrinho"},
        dryRun = false)
public class CompraTest {
}
