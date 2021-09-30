package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"/steps", "/hooks"},
        plugin = "html:target/report/Cucumber",
        monochrome = true,
        strict = true,
        tags = {"@Run"}
)
public class Runner {
}
