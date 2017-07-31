package test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
 
 
public class StartApplication {
 
private static AndroidDriver driver;
	
	 @Test
	 public void App() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	// Wait for 10 second
	 
	Thread.sleep(10000);
 
	// close the application
	 driver.quit();
	 }

	//@BeforeMethod
 public static AndroidDriver preconditions(String appPackage, String appActivity) throws MalformedURLException{
 // Create object of DesiredCapabilities class                             
 
DesiredCapabilities capabilities = new DesiredCapabilities();

 
capabilities.setCapability("deviceName", "MiMax2");
 
capabilities.setCapability("platformVersion", "7.1.1");
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("appPackage",appPackage);
capabilities.setCapability("appActivity",appActivity); 
 
driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

return driver;
 }

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}


}               
 
 
 
