package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingPojo {

	@Test(dataProvider="pojoProvider")
	public void testMethod(DataObject dataObject) {

		String username = dataObject.getUserName();
		String password = dataObject.getPassword();
		
		System.out.println("Username is: "+username);
		System.out.println("password is: "+password);
	}

	@DataProvider(name = "pojoProvider")
	public Object[][]  dataProviderMethod() {

		Object[][] dataObject = { 
									{ new DataObject("user1", "pass1") }, 
									{ new DataObject("user2", "pass2") } 
								};

		return dataObject;
	}

}
