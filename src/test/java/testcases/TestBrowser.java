package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBrowser {
	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.name("q")).sendKeys("hello kitty");
		driver.quit();
		
		
	}

}
 