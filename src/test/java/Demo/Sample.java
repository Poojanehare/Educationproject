package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
@Test
public void demo()
{
	WebDriverManager.chromedriver().setup();
	WebDriver dr = new ChromeDriver();
	dr.get("http://www.makemytrip.com");
	System.out.println(dr.getTitle());
	dr.close();
}
}
																																																																																																																																																																																																																																																																																																																																																																																																																																																												