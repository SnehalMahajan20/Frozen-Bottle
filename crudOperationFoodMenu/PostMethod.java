package crudOperationFoodMenu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostMethod {

	
	@Test
	
	public void postMethod()
	{
		baseURI="http://localhost:8080";
		JSONObject object = new JSONObject();
		//Admin object
		
		JSONObject admn1 = new JSONObject();
		
		admn1.put("email", "prajakta123@gmail.com");
		  admn1.put("id", "4");
		  admn1.put("name", "prajakta");
		  admn1.put("password", "Prajakta@364");
		  
		  //insert the admin values
		  object.put("admin", admn1);
		  
		  //product vale
		 JSONObject pd2 = new JSONObject();
		 pd2.put( "cost", 250);
		 pd2.put( "description", "testing");
	     
	     pd2.put( "name", "chine");
	      pd2.put( "type", "veg");
	      
	     	      
	      JSONArray ar = new JSONArray();
	      ar.add(pd2);
	      
	      //insert the product key
	      object.put( "product", ar);

	      
		  given()
		  
		  .contentType(ContentType.JSON)
		  .body(object)
		  
		  .when()
		  .post("/foodMenus")
		  
		  .then()
		  .assertThat().statusCode(201)
		  .log().all();
	}
}
