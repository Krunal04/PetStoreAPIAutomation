package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints2 {
	
	
	static ResourceBundle getURL(){
		
		ResourceBundle routes=ResourceBundle.getBundle("config"); //Load properties file
		return routes;
		
	}
	
	public static Response createUser(User payload){
		
		
		String userPostURL=getURL().getString("postURL");
		Response response=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		.when()
		    .post(userPostURL);
		
		return response;
			
		}
		
		public static Response readUser(String userName){
			
			String userGetURL=getURL().getString("getURL");
			Response response=given()
				.pathParam("username", userName)
			.when()
			    .get(userGetURL);
			
			return response;
	}
		
	   public static Response updateUser(String userName , User payload){
			
		   String userPutURL=getURL().getString("putURL");
		   Response response=given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.pathParam("username", userName)
				.body(payload)
				
			.when()
			    .put(userPutURL);
			
			return response;
	}
	   public static Response deleteUser(String userName){
			
		   String userDeleteURL=getURL().getString("deleteURL");
		   Response response=given()
				.pathParam("username", userName)
			.when()
			    .delete(userDeleteURL);
			
			return response;
	}

}
