import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src/test/reports/failedTest.txt",
        plugin = {
                "json:src/test/reports/FailedTestCases/failedJson.json",
                "html:src/test/reports/FailedTestCases",
                "pretty"}
)
public class FailedRunner {
}
