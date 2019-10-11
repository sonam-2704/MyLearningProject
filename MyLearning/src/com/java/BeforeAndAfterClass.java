package com.java;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterClass {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In beforeSuite method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("In beforeTest method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("In beforeClass method");
	}

	@BeforeGroups(groups={"first"})
	public void beforeGroups1() {
		System.out.println("In beforeGroups method");
	}
	
	@BeforeGroups(groups={"second"})
	public void beforeGroups2() {
		System.out.println("In beforeGroups method");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In beforeMethod method");
	}
	
	@Test(groups={"first"})
	public void testMethod1() {
		System.out.println("In actual test Method 1");
	}
	
	@Test(groups={"second"})
	public void testMethod2() {
		System.out.println("In actual test Method 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("In afterMethod method");
	}

	@AfterGroups(groups={"first"})
	public void afterGroups1() {
		System.out.println("In afterGroups method");
	}
	
	@AfterGroups(groups={"second"})
	public void afterGroups2() {
		System.out.println("In afterGroups method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("In afterClass method");
	}
	

	@AfterTest
	public void afterTest() {
		System.out.println("In afterTest method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("In afterSuite method");
	}

}
