package mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void bt() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			}
  @Test 
  public void test1() throws InterruptedException {
	  System.out.println("First Calculator Automation");
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_1")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_6")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_8")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
	  driver.findElement(MobileBy.AccessibilityId("plus")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_9")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_1")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_5")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_6")).click();
	  driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
	  driver.findElement(MobileBy.AccessibilityId("equals")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("clear")).click();
	  driver.navigate().back();
	  //driver.findElement(MobileBy.AccessibilityId("Phone")).click();
	  //Thread.sleep(1000);
	  //driver.findElement(MobileBy.AccessibilityId("Call History tab.")).click();
	  //Thread.sleep(1000);
	  //driver.findElement(MobileBy.AccessibilityId("key pad")).click();
	  //driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
	  //driver.findElement(MobileBy.AccessibilityId("1,")).click();
	  //driver.findElement(MobileBy.AccessibilityId("0,+")).click();
	  //driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
	  //driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
	  //driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
	  //driver.findElement(MobileBy.AccessibilityId("5,JKL")).click();
	  //driver.findElement(MobileBy.AccessibilityId("6,MNO")).click();
	  //driver.findElement(MobileBy.AccessibilityId("3,DEF")).click();
	  //driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
	  //driver.findElement(MobileBy.AccessibilityId("dial")).click();
	  //File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //FileUtils.copyFile(scr, new File("C:/Users/RJ Aditya/Pictures/scr1.png"));
	  
  }
  
  
}
