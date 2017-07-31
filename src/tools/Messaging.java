package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Messaging {
	//public static WebElement preconditions(){
	WebDriver driver;
	@FindBy(id="com.android.mms:id/fab")
	WebElement wb;
	
	@FindBy (id="com.android.mms:id/recipients_editor")
	WebElement editor;
	//WebElement web=findElement(By.id("com.android.mms:id/fab"));
	
	
	
//}
	public Messaging(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void launchMMS(){
		wb.click();
		editor.click();
		
	}
	public void compose(){
		System.out.println(",compose");
	}
	
}