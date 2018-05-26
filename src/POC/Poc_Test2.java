//package POC;
//
//import java.io.File;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.security.UserAndPassword;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//
//public class Poc_Test2 {
//	ExtentReports extent;
//	ExtentTest logger;
//	WebDriver driver;
//	
//	@BeforeTest()
//	public void login() throws InterruptedException {
//		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
//		//extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);
//		extent
//				.addSystemInfo("Host Name", "SoftwareTestingMaterial")
//				.addSystemInfo("Environment", "Automation Testing")
//				.addSystemInfo("User Name", "Sharad Kumar");
//		extent.loadConfig(new File(System.getProperty("user.dir")+ "\\extent-config.xml"));
//		logger = extent.startTest("passTest");	
//		logger.log(LogStatus.PASS, "Test case is started");
//	}
//	
//	@Test(priority = 1)
//	public void Login(){
//		System.setProperty("webdriver.firefox.bin","C:\\Users\\Q833701\\Downloads\\firefox-47.0.1.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
//		driver = new FirefoxDriver();
//		driver.get("http://usadc-vsltfsa01.quintiles.net/QSquaredTheme_Q2/Login.aspx");	
//		driver.findElement(By.id("WebPatterns_wt6_block_wtUsername_wtUserNameInput")).sendKeys("Q833701");
//		driver.findElement(By.id("WebPatterns_wt6_block_wtPassword_wtPasswordInput")).sendKeys("Quest@3288");
//		driver.findElement(By.id("WebPatterns_wt6_block_wtAction_wtLoginButton")).click();
//		logger.log(LogStatus.PASS, "User loggedIn Successfully");	
//		
//	}
//	
//	@Test(priority = 2)
//	public void SerchRegions(){
//		driver.findElement(By.id("CNL_Common_wt47_block_QSquaredTheme_Q2_wtThemeLayout_block_wt19_wtMainContent_wtMainContent_wtMainContent_WebPatterns_wt2_block_wtSearch_wrapper_wtSearchInput")).sendKeys("Africa");
//		driver.findElement(By.id("CNL_Common_wt47_block_QSquaredTheme_Q2_wtThemeLayout_block_wt19_wtMainContent_wtMainContent_wtMainContent_WebPatterns_wt2_block_wtSearch_wrapper_wt12")).click();
//		driver.findElement(By.id("CNL_Common_wt47_block_QSquaredTheme_Q2_wtThemeLayout_block_wt19_wtMainContent_wtMainContent_wtMainContent_wtRegionTable_ctl03_wt19")).click();
//		logger.log(LogStatus.PASS, "User is able to search regions");			 
//	}
//	
//	@Test(priority = 3)
//	public void Logout(){
//		//driver.findElement(By.id("CNL_Common_wt47_block_QSquaredTheme_Q2_wtThemeLayout_block_wt19_wtFixed_Footer_wt26_wtLogoutLink")).click();
//		driver.findElement(By.id("CNL_Common_wtThemeLayout_block_QSquaredTheme_Q2_wtThemeLayout_block_wt19_wtFixed_Footer")).click();
//		
//		driver.close();
//		logger.log(LogStatus.PASS, "User loggedout unsuccessfull");			 
//	}
//	
//	@AfterTest	
//	public void End(){
//		extent.endTest(logger);
//		logger.log(LogStatus.PASS, "Test Case is End");
//		extent.flush();
//		extent.close();
//	}
//}
