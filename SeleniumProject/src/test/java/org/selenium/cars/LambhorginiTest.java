package org.selenium.cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LambhorginiTest {
	@Test
	public void cars() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("LambhorginiTest Successfully launched", true);
		driver.quit();
	}
}
