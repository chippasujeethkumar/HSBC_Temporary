package HSBC_Training_Assignment.HSBC_Assignment4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreatingGoogleAccount {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
		driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get(" https://accounts.google.com/signup");
	    driver.manage().window().maximize();
	    
	    WebElement firstName=driver.findElement(By.id("firstName"));
	    WebElement lastName=driver.findElement(By.id("lastName"));
	    WebElement userName=driver.findElement(By.id("username"));
	    WebElement password=driver.findElement(By.xpath("//input[@name='Passwd']"));
	    WebElement confirmpassword=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	    WebElement nextBt=driver.findElement(By.xpath("//span[text()='Next']"));
	    
	    String fName,lName,uName,passsword,cPassword;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the firstname");
	    fName=s.nextLine();
	    System.out.println("Enter the lastName");
	    lName=s.nextLine();
	    System.out.println("Enter the userName");
	    uName=s.nextLine();
	    System.out.println("Enter the password");
	    passsword=s.nextLine();
	    System.out.println("Enter the confirmpassword");
	    cPassword=s.nextLine();
	    Thread.sleep(3000);
	    
	    firstName.sendKeys(fName);
	    lastName.sendKeys(lName);
	    userName.sendKeys(uName);
	    password.sendKeys(passsword);
	    confirmpassword.sendKeys(cPassword);
	    nextBt.click();
	    
	    
	}

}
