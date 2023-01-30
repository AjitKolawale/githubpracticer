package DemoP;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
public class demod2 {

	@Given("API1")
	public void api1() 
	{
		
			
		System.out.println("Cookies=="+get("https://dummy.restapiexample.com/api/v1/employees")
        .getStatusCode());
		System.out.println("Time=="+get("https://dummy.restapiexample.com/api/v1/employees")
        .timeIn(TimeUnit.SECONDS));
		System.out.println("Content Type=="+get("https://dummy.restapiexample.com/api/v1/employees")
        .getContentType());	
		given().get("https://dummy.restapiexample.com/api/v1/employees").then().log().all();
	}

	@When("API2")
	public void api2() 
	{
	   System.out.println("done");
	}

}
