package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ramakrishnareddy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mallireddy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("3310989616");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Deeksha@123.");
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd= new Select(element);
		dd.selectByIndex(23);
		WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select dd1= new Select(element1);
		dd1.selectByIndex(7);
		WebElement element2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select dd2= new Select(element2);
		dd2.selectByIndex(32);
		driver.findElement(By.xpath("//label[contains(@class, '_58mt')]")).click();
		
		
		
	}

}
