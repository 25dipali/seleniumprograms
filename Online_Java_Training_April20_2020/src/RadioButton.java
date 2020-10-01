import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		//Set Chrome browser properties & Chrome Driver path
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		
		List<WebElement>radios = driver.findElements(By.xpath("//input[contains(@type,'ra')]"));
	    System.out.println("No of radio buttons= " + radios.size());
	    
	    Thread.sleep(2000);
	    System.out.println(radios.get(0).isEnabled());
	    radios.get(0).click();
	    
	    Thread.sleep(2000);
	    System.out.println(radios.get(1).isDisplayed());
	    radios.get(1).click();
	    
	    Thread.sleep(2000);
	    System.out.println(radios.get(1).isSelected());
	    
	    Thread.sleep(2000);
	    System.out.println(radios.get(2).isDisplayed());
	    radios.get(2).click();
	    
		

	}

}
