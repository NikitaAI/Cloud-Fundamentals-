package Crud_operations;

import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class crud_create {
	public static void main(String[] args) {
		
				RestAssured.baseURI = "https://dev186929.service-now.com/api/now/table/";

			
				RestAssured.authentication = RestAssured.basic("admin", "2AqjN!lC2!Vy");

				
				Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
								+ "    \"short_description\": \"laptop issue\",\r\n" + "    \"description\": \"charging\"\r\n" + "}")
								.when().post("incident");

		
				response.prettyPrint();

				
				response.then().assertThat().statusCode(201);
				
				String sysid=response.jsonPath().getString("result.sys_id");
				System.out.println("System id is "+sysid);
		
	}

}
