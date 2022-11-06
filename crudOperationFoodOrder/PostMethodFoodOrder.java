package crudOperationFoodOrder;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostMethodFoodOrder {
	@Test
	
	public void postmethodfoodorder()
	{
		baseURI="http://localhost:8080";
		
 	
		JSONObject main=new JSONObject();
		main.putIfAbsent("dateTime","2022-11-04T11:41:24.815Z");
		main.put("id", 5);
		
		
		JSONArray aItems=new JSONArray();
		
		JSONObject items=new JSONObject();
		items.put("category", "Lunch");
		items.put("Lunch", 250);
		items.put("id", 9);
		items.put("name","pushki");
		items.put("quantity", 4);
		
		
		aItems.add(items);
		
		main.put("items", aItems);
		main.put("status", "dispatched");
		main.put( "totalCost",1000);
		
		
 
		
		given()
		 .contentType(ContentType.JSON)
		 .body(main)
		 .when()
		 .post("/foodorders")
		 .then()
		 .assertThat().statusCode(201)
		 .log().all();
}

}
