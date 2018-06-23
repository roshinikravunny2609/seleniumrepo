package Test_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleTestNG {
	WebDriver driver = new FirefoxDriver();
@BeforeTest
	public void beforeTest() {
	driver.get("https://www.amazon.in");
	
	}
@Test
public void login() {
driver.findElement(By.xpath("//*[text()='Hello. Sign in']")).click();
driver.findElement(By.xpath("(//*[@class='a-column a-span12 a-text-left'])[1]")).click();
}
@Test
public void logout() {
Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Hello')]"));
actions.moveToElement(element).build().perform();
WebElement ele1= driver.findElement(By.xpath("//*[contains(text(),'Sign Out')]"));
actions.moveToElement(ele1).build().perform();
actions.click();
}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
