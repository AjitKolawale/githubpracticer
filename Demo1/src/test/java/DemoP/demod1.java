package DemoP;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import javax.xml.validation.Schema;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.json.simple.JSONObject;
import org.testng.Assert;
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



JSONObject data = new JSONObject();
data.put("name","Roy");
data.put("salary",77);
data.put("age", 24);
data.put("id", 17);

System.out.println(data);

baseURI="https://dummy.restapiexample.com";

given().header("Content-Type","application/json").contentType(ContentType.JSON)
.accept(ContentType.JSON).body(data.toJSONString()).when().
post("/api/v1/create").then().log().all();


	}

	@Then("API test Complete")
	
	
	public void api_test_complete() 
	{
		
		
System.out.println("All Done");

	}
	
	
	
	
}
