import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		List<WebElement>checkbox = driver.findElements(By.xpath("//input[contains(@type,'c')]"));
		System.out.println("No of checkboxes= "+ checkbox.size());

		
		System.out.println(checkbox.get(0).isDisplayed());
		System.out.println(checkbox.get(0).isEnabled());
		Thread.sleep(2000);
		checkbox.get(0).click();
		
		Thread.sleep(3000);
		System.out.println(checkbox.get(1).isEnabled());
		checkbox.get(1).click();
		
		Thread.sleep(2000);
		System.out.println(checkbox.get(0).isSelected());
		checkbox.get(0).click();
	}

}
