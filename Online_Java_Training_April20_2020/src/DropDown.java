import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    List<WebElement>bm = driver.findElements(By.xpath("//*[contains(@title,'Mo')]/option"));
    for(int i=0;i<bm.size();i++)
    {
    	System.out.println(bm.get(i).getText());
        
    }
    
    
    WebElement month = driver.findElement(By.xpath("//*[contains(@title,'Mo')]"));
    Select m = new Select(month);
    
    List<webElement>dropdown = driver
}
