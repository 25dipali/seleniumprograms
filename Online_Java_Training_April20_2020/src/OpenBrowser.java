

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://www.google.com");
	}
}
