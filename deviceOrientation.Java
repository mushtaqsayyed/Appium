package browserstackTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

public class scrollInAndroid {
	
	public static String userName = "<your username>";
	  public static String accessKey = "<your accessKey>";

	  public static void main(String args[]) throws MalformedURLException, InterruptedException {
	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "Samsung Galaxy S8 Plus");
	    caps.setCapability("app", "bs://9538420730543fc75a23b2c8f37037cb7b885f12");
	    caps.setCapability("deviceOrientation", "landscape");

	    AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

	    Thread.sleep(5000);

	    ScreenOrientation orientation = driver.getOrientation();
	    System.out.println(orientation);

	    
	if(orientation.toString() == "LANDSCAPE"){

		driver.rotate(ScreenOrientation.PORTRAIT);
		
	}

	    	Thread.sleep(5000);
	    	
	    driver.quit();
	  }
	
}
