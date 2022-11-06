package crudOperationFoodMenu;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteMethod {
	@Test
	public void deletemethod()
	{
		baseURI="http://localhost:8080";
		
		when()
		.delete("/foodMenus/3")
		
		.then()
		.assertThat().statusCode(200)
		.log().all();
		}

	
	}

