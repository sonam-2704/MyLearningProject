package testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="dataProvider")
	public static Object [][] dataProviderMethod(){
		
		Object [][] dataObject = {{"data-one"},{"data-two"}};
		
		return dataObject;
	
	
	}
	
}
