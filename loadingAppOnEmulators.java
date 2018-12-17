package browserstackAppAutomate;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class loadingAppOnEmulators {

	public static final String URL = "http://127.0.0.1:4723/wd/hub";	
	  static AppiumDriver<MobileElement> driver;
	  
	  public static void main(String[] args) throws MalformedURLException, InterruptedException {

		  
		  DesiredCapabilities caps = new DesiredCapabilities();
		  
caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
		  caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
//		  caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		  
		  caps.setCapability(MobileCapabilityType.APP, "/Users/mushtaq/Downloads/BStackSampleApp.ipa");
		  
		  caps.setCapability("udid", "1A43FD35-6347-4941-947F-17C30E4D4B14");

driver = new IOSDriver<MobileElement>( new URL(URL), caps);
		  
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

Thread.sleep(5000);
	
			driver.quit();
}

}
