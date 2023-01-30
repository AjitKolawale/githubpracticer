package DemoP;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\demod1.feature",glue={"DemoP"}
,monochrome= true ,plugin={"pretty","html:target/report.html"})



public class demod1Runner {
	
	
}
