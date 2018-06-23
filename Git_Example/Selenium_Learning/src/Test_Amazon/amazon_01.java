package Test_Amazon;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.codec.binary.Base64;

public class amazon_01  {
	
	public static void main(String[] args) throws InterruptedException {
		//declaration and installation of objects/variables
		//System.setProperty("webdriver.firefox.marionette", "//Users//Roshini//Downloads//geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		String strUrl = "https://www.amazon.in/";
		driver.get(strUrl);
		WebElement lnkSignIn = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		WebElement btnSignIn = driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-newCust']/a"));
		WebElement txtbxEmail = driver.findElement(By.id("ap_email"));
		WebElement btnContinue = driver.findElement(By.id("continue"));
		WebElement txtbxPassword = driver.findElement(By.id("ap_password"));
		WebElement btnLogin = driver.findElement(By.id("signInSubmit"));
		WebElement lnkShopAll = driver.findElement(By.id("nav-link-shopall"));
		//WebELement txtbxPassword = driver.findElement(By.id("ap_password"));
		
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(strUrl);
		
		
		
		
		//moverhover on a particular element
		
		Actions action = new Actions(driver);
		action.moveToElement(lnkSignIn).build().perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//lnkSignIn.click();
		System.out.println("Sign In clicked");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		btnSignIn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		txtbxEmail.clear();
		txtbxEmail.sendKeys("ganapathykr@yahoo.com");
		btnContinue.click();
		String password = "703703";
		txtbxPassword.clear();
		txtbxPassword.sendKeys(password);
		
		//String str = "703703";
		byte[] encode = Base64.encodeBase64(password.getBytes());
		String str1 = new String(encode);
		
		
		System.out.println("String before encoding is: " +password);
		System.out.println("String after encoding is: " + str1);
		
		btnLogin.click();
		lnkShopAll.click();
		
		
		
		
		
		
	
		
		
		/*String baseUrl = "https://www.amazon.in/";
		String expectedPageTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle;
		
		//methods used on the objects /variables
		
		//launch browser
		driver.get(baseUrl);
		//verification
		System.out.println("OPENED");
	
		
		actualTitle = driver.getTitle();
		
		//compare the results
		if(actualTitle.contentEquals(expectedPageTitle)) {
			System.out.println("Test Passed");
		}
			else {
				System.out.println("Test Failed");
			}
		
		
		//driver.get("https://www.amazon.in/");
		
		
		driver.quit();
		System.out.println("Browser closed");
		//driver.navigate();*/
		
		
		//driver.close() and driver.quit() for popups
	//driver.close() closes the parent window only, not the child or popup windows
		//driver.get("http://www.popuptest.com/popuptest2.html");
       // driver.close(); //only the parent browser window was closed and not the two pop-up windows. 
		
        //driver.get("http://www.popuptest.com/popuptest2.html");
       // driver.quit();  // using QUIT all windows will close
        
        //switchTo().frame()
		
        /*driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated"));
        System.out.println("IsPresent");
        driver.close();*/
        
        //switching to the alert window or popup window
        /*String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMessage);*/
		
        
        
        //explicit wait
		
		/*WebDriverWait myWait = new WebDriverWait(driver,10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("tutorial");
		
		//expected conditions
		
		if(myWait.until(ExpectedConditions.alertIsPresent()) != null) {
			System.out.println("Alert is present!");
			
		}
		WebElement txtUsername = myWait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		myWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("viewIFRAME"));
		
		//try catch block with enabled 
		WebElement txtUserName = driver.findElement(By.id("username"));
		try {
		if(txtUserName.isEnabled()) {
			txtUserName.clear();
			txtUsername.sendKeys("Roshini");
		}
		}
		catch(NoSuchElementException e){
			System.out.println(e.toString());
		}
		
		//if we use Explicit wait, then the exception used shd be TimeOutException
		
		WebDriverWait myWaitVar = new WebDriverWait(driver,3);
		try {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		driver.findElement(By.id("username")).sendKeys("Roshini");
		}
		catch (TimeoutException e) {
			System.out.println(e.toString());
		}
		*/
        
        
        
        
        driver.quit(); 
	}
	/*public static String decodeStr(String str1)
	{
	byte[] decode = Base64.decodeBase64(encode);
	System.out.println("String after decoding is: " +new String(decode));
	return new String(decoded);*/
	}


