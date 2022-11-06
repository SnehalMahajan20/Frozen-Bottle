package crudOperationFoodOrder;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetMethodFoodOrder {
	@Test
	public void getfoodmenucontroller() {
		baseURI = "http://localhost:8080";
		
		when().get("/foodorders?id=3")
				.then().assertThat().statusCode(415)
				.log().all();

	}

}
