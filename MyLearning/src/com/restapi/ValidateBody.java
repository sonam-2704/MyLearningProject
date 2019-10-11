package com.restapi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateBody {

	@Test
	public void WeatherMessageBody() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification objRequestSpecification = RestAssured.given();

		Response response = objRequestSpecification.get("/Hyderabad");

		// Retrieve the body of the Response
		ResponseBody responseBody = response.body();

		// By using the ResponseBody.asString() method, we can convert the body
		// into the string representation.
		String responseBodyString = responseBody.asString();

		System.out.println("Response: " + responseBodyString);

		// To check for sub string presence get the Response body as a String.
		// Do a String.contains
		Assert.assertEquals(
				responseBodyString.contains("Hyderabad") /* Expected value */,
				true /* Actual Value */, "Response body contains Hyderabad");

		Assert.assertEquals(
				responseBodyString.toLowerCase()
						.contains("hyderabad") /* Expected value */,
				true /* Actual Value */, "Response body contains Hyderabad");

		// First get the JsonPath object instance from the Response interface
		JsonPath jsonPath = response.jsonPath();

		// Let us print the city variable to see what we got
		System.out.println("City received from Response " + jsonPath.get("City"));

		// Print the temperature node
		System.out.println("Temperature received from Response " + jsonPath.get("Temperature"));

		// Print the humidity node
		System.out.println("Humidity received from Response " + jsonPath.get("Humidity"));

		// Print weather description
		System.out.println("Weather description received from Response " + jsonPath.get("Weather"));

		// Print Wind Speed
		System.out.println("City received from Response " + jsonPath.get("WindSpeed"));

		// Print Wind Direction Degree
		System.out.println("City received from Response " + jsonPath.get("WindDirectionDegree"));
		
		//Below line of code extracts the status code from the message:
		int statusCode = response.getStatusCode();
		 
		// Assert that correct status code is returned.
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		
		 // Get the status line from the Response and store it in a variable called statusLine
		 String statusLine = response.getStatusLine();
		 Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");

	
	
	
	}

	
	public void GetWeatherHeaders()
	{
	 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	 RequestSpecification requestSpecification = RestAssured.given();
	 Response response = requestSpecification.get("/Hyderabad");
	 
	 // Reader header of a give name. In this line we will get
	 // Header named Content-Type
	 String contentType = response.header("Content-Type");
	 System.out.println("Content-Type value: " + contentType);
	 
	 // Reader header of a give name. In this line we will get
	 // Header named Server
	 String serverType =  response.header("Server");
	 System.out.println("Server value: " + serverType);
	 
	 // Reader header of a give name. In this line we will get
	 // Header named Content-Encoding
	 String acceptLanguage = response.header("Content-Encoding");
	 System.out.println("Content-Encoding: " + acceptLanguage);
	}


@Test
public void IteratingOverHeaders()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification requestSpecification = RestAssured.given();
	Response response = requestSpecification.get("/Hyderabad");

	// Get all the headers. Return value is of type Headers.
	// Headers class implements Iterable interface, hence we
	// can apply an advance for loop to go through all Headers
	// as shown in the code below
	Headers allHeaders = response.headers();

	// Iterate over all the Headers
	for(Header header : allHeaders)
	{
		System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
	}
}

}
