package api.endpoints;

/*
 Swagger URI --> https://petstore.swagger.io/
 
 Create user(POST) --> https://petstore.swagger.io/v2/user
 Get user(GET) --> https://petstore.swagger.io/v2/user/{username}
 Update user(PUT) --> https://petstore.swagger.io/v2/user/{username}
 Delete user(DELETE) --> https://petstore.swagger.io/v2/user/{username}
 
 */

public class Routes {
	
	public static String baseURL = "https://petstore.swagger.io/v2";
	
	// User module
	
	public static String userPostURL = baseURL+"/user";
	public static String userGetURL = baseURL+"/user/{username}";
	public static String userPutURL = baseURL+"/user/{username}";
	public static String userDeleteURL = baseURL+"/user/{username}";
		

}
