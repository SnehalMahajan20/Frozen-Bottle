package crudOperationFoodMenu;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetMethod {
	@Test
	
	public void getfoodmenucontroller()
	 {
	    baseURI="http://localhost:8080";
	    
	    
	    
	    when()
	    .get("/foodMenus/7")
	    
	    .then()
	    .assertThat().statusCode(200)
	    .log().all();
 }

}
