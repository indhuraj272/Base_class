package org.reusuable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	
	public static WebDriver browserlanuch(String browsername){
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webDriver.chrome.driver", "/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/Driver");
			ChromeOptions op=new ChromeOptions();
		       op.addArguments("incognito");
		       driver=new ChromeDriver(op);
		       driver.get("https://www.google.com/");
//		       driver.get("https://www.mozilla.org/");
		}
	else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webDriver.gecko.driver", "/home/hp/Downloads/Selenium ---4/gecko");
			driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			return driver;
			
		} 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
return driver;
	
	}
	public static String urllanuch(String url) {
		driver.get(url);
		return url;
	}
	public static void screenscot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File(path);
	    FileUtils.copyFile(source,destination);
	} 
	public static void max() {
		driver.manage().window().maximize();
	}
	
	public static String title() {
	 String title = driver.getTitle();
	 return title;
	}
	public static  void sendkey(WebElement element,String value) {
          element.sendKeys(value);
	}
	public static void clickon(WebElement element) {
		element.click();
	}
	public static void down() throws AWTException {
		Robot rs=new Robot();
	    rs.keyPress(KeyEvent.VK_DOWN);
	    rs.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void enter() throws AWTException{
		Robot rs=new Robot();
	    rs.keyPress(KeyEvent.VK_ENTER);
	    rs.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void alertaccept() {
		driver.switchTo().alert().accept();
	}
	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void dropdown_Index(WebElement element, int i) {
		Select s=new Select(element);
		s.selectByIndex(i);
		
	}
	
//	public static void login() throws IOException {
//		driver.findElement(By.id("username")).sendKeys("indhuraj2702");
//		driver.findElement(By.id("password")).sendKeys("@yy8dPATFSL3Wm");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//	    File source=ts.getScreenshotAs(OutputType.FILE);
//	    File destination=new File("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/screen1\\snap.png");
//	    FileUtils.copyFile(source,destination);
//		driver.findElement(By.id("login")).click();
//	}
//	public static void down() throws AWTException {
//		Robot rs=new Robot();
//	    rs.keyPress(KeyEvent.VK_DOWN);
//	    rs.keyRelease(KeyEvent.VK_DOWN);
//	}
//	public static void enter() throws AWTException{
//		Robot rs=new Robot();
//	    rs.keyPress(KeyEvent.VK_ENTER);
//	    rs.keyRelease(KeyEvent.VK_ENTER);
//	}
//	public static void search_hotel() throws AWTException, IOException {
//		driver.findElement(By.id("location")).click(); down(); down(); enter();
//		driver.findElement(By.id("hotels")).click();  down(); down(); enter();
//		driver.findElement(By.id("room_type")).click(); down(); down(); enter();
//	    driver.findElement(By.id("room_nos")).click(); down(); down(); enter();
//	    driver.findElement(By.id("adult_room")).click(); down(); down(); down(); enter();
//	    driver.findElement(By.id("child_room")).click(); down(); down(); down(); enter();
//	    TakesScreenshot ts=(TakesScreenshot)driver;
//	    File source=ts.getScreenshotAs(OutputType.FILE);
//	    File destination=new File("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/screen2\\snap.png");
//	    FileUtils.copyFile(source,destination);
//	    driver.findElement(By.id("Submit")).click();    
//	 }
//	public static void select_hotel() throws AWTException, InterruptedException, IOException {
//		WebElement sh1 = driver.findElement(By.xpath("//table[@cellspacing='1']/tbody/tr[2]/td/input"));
//		sh1.click();
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("first_name")).sendKeys("indhu");
//		driver.findElement(By.id("last_name")).sendKeys("Raj");
//		driver.findElement(By.id("address")).sendKeys("2/62,pappyanayakarpatti, srivilliputtur,mallipost");
//		driver.findElement(By.id("cc_num")).sendKeys("1234567887653456");
//		driver.findElement(By.id("cc_type")).click(); down(); down(); down(); down(); enter();
//		driver.findElement(By.id("cc_exp_month")).click(); down(); down(); down(); down(); enter();
//		driver.findElement(By.id("cc_exp_year")).click(); down(); down(); down(); down(); enter();
//		driver.findElement(By.id("cc_cvv")).sendKeys("234");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//	    File source=ts.getScreenshotAs(OutputType.FILE);
//	    File destination=new File("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/screen3\\snap.png");
//	    FileUtils.copyFile(source,destination);
//		driver.findElement(By.id("book_now")).click();
////  Thread.sleep(7000);
//		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
//		driver.get("https://adactinhotelapp.com/BookedItinerary.php");
//		TakesScreenshot ts1=(TakesScreenshot)driver;
//	    File source1=ts1.getScreenshotAs(OutputType.FILE);
//	    File destination1=new File("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/screen4\\snap.png");
//	    FileUtils.copyFile(source1,destination1);
//	}
//	public static void Booked_Itinerary() throws InterruptedException, IOException {
//		driver.findElement(By.xpath("//table[@cellpadding='5']/tbody/tr[2]/td[1]")).click();
//		driver.findElement(By.xpath("//input[@name='cancelall']")).click();
////		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
////		Thread.sleep(2000);
//		TakesScreenshot ts=(TakesScreenshot)driver;
//	    File source=ts.getScreenshotAs(OutputType.FILE);
//	    File destination=new File("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/screen5\\snap.png");
//	    FileUtils.copyFile(source,destination);
//		driver.findElement(By.id("logout")).click();
//	TakesScreenshot ts2=(TakesScreenshot)driver;
//	    File source2=ts2.getScreenshotAs(OutputType.FILE);
//	    File destination2=new File("/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/screen6\\snap.png");
//	    FileUtils.copyFile(source2,destination2);
//	}

}
