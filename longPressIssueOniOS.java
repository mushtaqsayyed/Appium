package browserstackAppAutomate;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.IOSElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.IOSElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class longPressIssueOniOS {

	public static String userName = "mushtaqsayyed1";
	public static String accessKey = "Hh2ibSxRxYXDjmP8VEWf";

	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("app", "bs://6c84fb2241c33cd507ea820bf79708e35203d983");
		caps.setCapability("os_version", "10.3");
		caps.setCapability("device", "iPhone 7 Plus");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.appium_version", "1.8.0");
		// caps.setCapability("autoAcceptAlerts", "true");
		// caps.setCapability("autoGrantPermissions", "true");

		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
				new URL("http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);

		/*
		 		  
		 
		  WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Allow"))); pop.click();
		  
		 * For iOS either click on allow button by using webelement or use alert accept method;
		 
		 */
		
		
		driver.switchTo().alert().accept();

		IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.name("SettingsButton")));
		textButton.click();

		IOSElement textButton1 = (IOSElement) new WebDriverWait(driver, 30)
				.until(ExpectedConditions.elementToBeClickable(MobileBy.name("Sign into Provider")));
		textButton1.click();

		IOSElement textButton2 = (IOSElement) new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(MobileBy.xpath("//XCUIElementTypeButton[@name='ParentalGatingLadybug']")));

		new TouchAction(driver).longPress(ElementOption.element(textButton2)).release().perform(); // For
																									// long
																									// press
																									// on
																									// specific
																									// element

		/*
		  new TouchAction(driver).press(PointOption.point(123,233)).waitAction().release().perform();
		 
		  just give X and Y coordinate instead of 123 and 233 and you will be able to tap on specific coordinate.
		 
		 */

		Thread.sleep(10000);

		driver.quit();
	}

}
