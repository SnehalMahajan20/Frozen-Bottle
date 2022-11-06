package crudOperationFoodOrder;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;



public class DeleteMethodFoodOrder {
	@Test
	public void deletemethodfoodorder()
	{
		baseURI="http://localhost:8080";
		
		when()
		.delete("/foodorders/5")
		
		.then()
		.assertThat().statusCode(415)
		.log().all();
		}
	
}



