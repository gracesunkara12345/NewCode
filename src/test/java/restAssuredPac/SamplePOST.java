package restAssuredPac;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
public class SamplePOST {

public static HashMap map = new HashMap();

	@BeforeClass
	public void prePost()
	{
		map.put("name", RestUtils.getName());
		map.put("job", "leader");
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users";
	}
	@Test
	public void testPost()
	{
	given()
		.contentType("application/json")
		.body(map)
	.when()
		.post()
	.then()
		.statusCode(201)
	.and()
		.assertThat().body("job",equalTo("leader"))	
		.log().all();
	}

}

