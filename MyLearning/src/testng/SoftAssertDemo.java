package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftAssertDemo {

	
	@Test
	public void testSoft(){
		
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 started");
		
		assertion.assertEquals(true, false);
		System.out.println("Test 1 completes");
		
		assertion.assertAll();
		
		/*System.out.println("Test 1 started");
		
		Assert.assertTrue(false);
		System.out.println("Test 1 completes");*/
		
	}
	
	@Test
	public void testHrdAssert(){
		
		System.out.println("Test 2 started");
		
		Assert.assertTrue(false);
		System.out.println("Test 2 completes");
		
		
	}

}
