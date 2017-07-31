package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import Utils.AppIdentifiers;
import io.appium.java_client.android.AndroidDriver;
import tools.Messaging;


	public class TestCase_Messaging{
	static Messaging message;

  @Test
    public static void testCode() throws MalformedURLException{
	  AndroidDriver dr= StartApplication.preconditions(AppIdentifiers.MessagePackage,AppIdentifiers.MessageActivity);
	  message=new Messaging(dr);
	  message.launchMMS();
	  message.compose();
	 // assertEquals(actual, expected);

	  
  }

	}

	

