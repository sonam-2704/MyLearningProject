package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferentClassDataProvider {

	@Test(dataProvider="dataProvider",dataProviderClass=DataProviderClass.class)
	public void testMethod(String data){
		
		System.out.println("Data is :"+data);
		
	}
}
