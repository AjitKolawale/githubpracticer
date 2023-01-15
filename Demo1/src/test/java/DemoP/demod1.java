package DemoP;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import javax.xml.validation.Schema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.*;
public class demod1 {
	@Given("API Test")
	
	public void api_test()
	{
		
baseURI="https://dummy.restapiexample.com";
given().get("/api/v1/employees").
then().assertThat().statusCode(200).body(matchesJsonSchemaInClasspath("Schema.json")).log().all();




System.out.println("=________________________________________________________________________________________==");

baseURI="https://dummy.restapiexample.com";

JSONObject request = new JSONObject();
request.put("name","Amee");
request.put("salary","800000000");
request.put("age","25");
System.out.println(request);
given().header("Content-Type","application/json").contentType(ContentType.JSON)
.accept(ContentType.JSON).body(request.toJSONString()).when().
post("/api/v1/create").then().log().all();

	}

	@Then("API test Complete")
	
	
	public void api_test_complete() 
	{
System.out.println("All Done");

	}
	
	
	
	
}
