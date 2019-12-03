package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {


	
	@Test(dataProvider="dataProviderMethod")
	public void testMethod(String data){
		
		System.out.println("Data is :"+data);
		
	}
	
	@DataProvider
	public Object [][] dataProviderMethod(){
		
		Object [][] dataObject = {
									{"data-one"},
									{"data-two"}
								 };
		
		return dataObject;
	
	
	}
}
