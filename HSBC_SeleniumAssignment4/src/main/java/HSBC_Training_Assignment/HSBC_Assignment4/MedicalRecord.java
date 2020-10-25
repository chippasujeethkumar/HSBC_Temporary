package HSBC_Training_Assignment.HSBC_Assignment4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MedicalRecord {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
	    driver.manage().window().maximize();
	    
	    WebElement medicalRecord=driver.findElement(By.xpath("/html/body/div/div[2]/div/h1"));
	    WebElement search=driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]/a"));
	    WebElement dropdown=driver.findElement(By.id("search_type"));
	    
	   // /html/body/div/div[2]/div/h1
	    medicalRecord.click();
	    search.click();
	    dropdown.click();
	    

	}

}
