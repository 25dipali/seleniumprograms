import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    WebElement BirthDay = driver.findElement(By.xpath("//*[contains(@name,'birthday_d')]"));
    Select day = new Select(BirthDay);
    
    List<WebElement>dropdown = day.getOptions();
    for(int i=0; i<dropdown.size(); i++)
    {
    String dropdownValues = dropdown.get(i).getText();
    Thread.sleep(3000);
    if(dropdownValues.equalsIgnoreCase("3"))
    {
    	dropdown.get(i).click();
    }
    }
	}
	

}
