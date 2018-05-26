package POC;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.UserAndPassword;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Poc_test {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	@Test()
	public void login() throws InterruptedException {
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
		extent = new ExtentReports(System.getProperty("user.dir")
				+ "/test-output/STMExtentReport.html", true);

		extent
				.addSystemInfo("Host Name", "SoftwareTestingMaterial")
				.addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Sharad Kumar");
		extent.loadConfig(new File(System.getProperty("user.dir")+ "\\extent-config.xml"));

		System.setProperty(
				"webdriver.firefox.bin",
				"C:\\Users\\Q833701\\Downloads\\"
						+ "firefox-47.0.1.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
		driver = new FirefoxDriver();
		// driver.get("http://usadc-vsltfsa01.quintiles.net/CNL_Common/LandingPage.aspx");
		// driver.switchTo().alert().authenticateUsing(new
		// UserAndPassword("Q833701","XXXX"));
		logger = extent.startTest("passTest");

		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Dog");
		element.submit();
		driver.close();
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		extent.endTest(logger);
		
	}
	@AfterTest
	
	public void End(){
		logger.log(LogStatus.PASS, "Test Case Passed is End");
		extent.flush();
		extent.close();
	}

	
}
