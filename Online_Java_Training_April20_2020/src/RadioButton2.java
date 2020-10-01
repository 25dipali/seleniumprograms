import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(2000);
		List<WebElement>radios = driver.findElements(By.xpath("//input[contains(@name,'b')]"));
		System.out.println("No of radio buttons:" + radios.size());
		
		System.out.println(radios.get(0).isSelected());
		
		Thread.sleep(2000);
		System.out.println(radios.get(1).isDisplayed());
		
		Thread.sleep(2000);
		radios.get(1).click();
		
		
		System.out.println(radios.get(0).isEnabled());
		Thread.sleep(2000);
		System.out.println(radios.get(2).isDisplayed());
		radios.get(2).click();
		
		
		

	}

}
