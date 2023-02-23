package mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class khan_academy {
	AndroidDriver<AndroidElement>driver;
	
	 @BeforeTest
	  public void beforeTest() throws MalformedURLException {
		  DesiredCapabilities dc =new DesiredCapabilities();
		  dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		  dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		  dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android" );
		  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		  driver= new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		  }
  @Test
  public void f() throws InterruptedException {
	  System.out.println("testing the khan academy application");
	  
	  Thread.sleep(6000);
	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")).click();
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Continue with Google\"]/android.view.ViewGroup")).click();
	  Thread.sleep(2000);
	  //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.google.android.gms:id/account_name")).click();
	  Thread.sleep(8000);
	  //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button[2]")).click();
	  //Thread.sleep(10000);
	  //driver.findElement(MobileBy.xpath("//android.widget.EditText[@content-desc=\"e.g. ABC123 or teacher@example.com\"]")).sendKeys("python12@gamil.com");
	  //search for subjects
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_search")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button[1]/android.view.ViewGroup")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc=\"Class 6 (Foundation)\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.Button/android.view.ViewGroup")).click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.Button/android.view.ViewGroup/android.view.ViewGroup")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button/android.view.ViewGroup")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.Button/android.view.ViewGroup")).click();
	  Thread.sleep(3000);
	  //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
	  // Thread.sleep(8000);
	  //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View")).click();
	  //Thread.sleep(8000);
	  //Thread.sleep(3000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Bookmark\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("android:id/button2")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("Bookmarks tab")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("org.khanacademy.android:id/tab_bar_button_home")).click();
	  Thread.sleep(2000);
	  //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
	  driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
	  //Thread.sleep(2000);
	  //driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.Button/android.view.ViewGroup")).click();
	  }
  
  
	  @AfterTest
	  public void afterTest() {
	  System.out.println("testing the khan academy application");
	  }
  }
  

