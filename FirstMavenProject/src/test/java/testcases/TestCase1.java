package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void ts01() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		driver.quit();
	}
}
