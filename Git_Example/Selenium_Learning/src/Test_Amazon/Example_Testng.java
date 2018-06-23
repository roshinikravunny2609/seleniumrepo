package Test_Amazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Testng {

	
	@Test(priority=1)
	public void m6() {
		System.out.println("This is my test method 2");
	}
@Test(priority=2)
public void m1() {
	System.out.println("This is my test method 1");
}
@BeforeTest
public void m2() {
	System.out.println("This is my before test method");
}
@AfterTest
public void m3() {
	System.out.println("This is After test method");
}
@BeforeClass
public void m4() {
	System.out.println("This is my Before class method");
}
@AfterClass
public void m5() {
	System.out.println("This is my After class method");
}
@BeforeMethod
public void m7() {
	System.out.println("This is my Before method");
}
@AfterMethod
public void m8() {
	System.out.println("This is my After method");
}
@BeforeSuite
public void m9() {
	System.out.println("This is my Before Suite");
}
@AfterSuite
public void m10() {
	System.out.println("This is my After Suite");
}
}
//annotations
//parameter
//xml , running multiple tests
//data provider

//convert java methd to test method
//Annotations
//@Test
//before test, before class, test, after class, after test
//After Suite -- TO email the reports and copy the reports to a folder, those things can be done in After Suite
//Drawbacks of TestNG:no priority in running tests

//After method annotation is used to take screenshot

//new tools website-- login and logout
//create new class @BeforeClas or BEfore Test , setup all the get Driver and all
//@Test --Login
//@Test -- LogOut
//@AfterTest -- TearDown
//Declare WebDriver driver golbally outside all the methods