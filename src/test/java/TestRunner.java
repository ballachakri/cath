import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "src/test" },
        tags = {"@search"},
        monochrome = true,
        plugin = {"html:src/test/reports",
                  "json:src/test/reports/cath.json",
                  "rerun:src/test/reports/FaiLedTestCases/failedTest.txt",
                  })
public class TestRunner {
}
