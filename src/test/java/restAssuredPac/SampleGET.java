package restAssuredPac;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class SampleGET {
	
	@Test
	public static void getAPI()
	{
	given()
	.when()
		.get("https://cat-fact.herokuapp.com/facts/")
	.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.header("Content-Type", "application/json; charset=utf-8");
	}

}
