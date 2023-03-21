package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class EditLead  extends BaseClass{
	
	@BeforeTest
	public void getdata() {
		datafile="EditLead";
	}
	@Test(dataProvider="fetch")
	public  void edit(String fn, String cn) throws InterruptedException {
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fn);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement we = driver.findElement(By.id("updateLeadForm_companyName"));
		we.clear();
		we.sendKeys(cn);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
}
}






