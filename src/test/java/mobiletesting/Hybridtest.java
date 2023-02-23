package mobiletesting;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Hybridtest extends Capability{
	AndroidDriver<AndroidElement> driver;
		
	
	@Test
  public void test1() throws MalformedURLException {
	  driver = cap();
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
  }
  }
