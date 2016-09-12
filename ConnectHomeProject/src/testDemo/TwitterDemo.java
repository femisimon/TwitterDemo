package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is a test");
		System.setProperty("webdriver.chrome.driver", "/Users/femisimon/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(DataProperties.dataProperty("URL"));
		Thread.sleep(3000);
		driver.findElement(By.className("js-username-field")).sendKeys(DataProperties.dataProperty("username"));
		System.out.println("This is working");
		driver.findElement(By.className("js-password-field")).sendKeys(DataProperties.dataProperty("password"));
		driver.findElement(By.xpath(".//*[@id='page-container']/div/div[1]/form/div[2]/button")).click();
		driver.findElement(By.id("tweet-box-home-timeline")).click();
		driver.findElement(By.id("tweet-box-home-timeline")).sendKeys(DataProperties.dataProperty("Message"));
		driver.findElement(By.className("tweet-action")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
