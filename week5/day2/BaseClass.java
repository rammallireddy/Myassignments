package week5.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
public class BaseClass {
	
		public RemoteWebDriver driver;
		public String datafile;
	
	@BeforeMethod
	@Parameters({"browser","url","username","password"})
	
	
	public void beforemethod(String browser,String url,String username,String password){
		if(browser.equalsIgnoreCase("chrome")) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("disable-notifications");
		 driver = new ChromeDriver(opt);
		}
		else if(browser.equalsIgnoreCase("edge")){
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@AfterMethod
public void aftermethod() {}

@DataProvider(name="fetch")
public String[][] fetchData() throws IOException {
	return ReadIntegraWithCreateLead.readData(datafile);
	
}
}