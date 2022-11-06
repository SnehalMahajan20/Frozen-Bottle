package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerToken {
	@Test
	
	public void BearerToken()
	{
		baseURI="https://api.github.com";
		
		JSONObject object = new JSONObject();
		object.put("name", "Basic");
		
		
		given().auth().oauth2(" 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")
		.body(object).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
	}

}
