package HSBC_Training_Assignment.HSBC_Assignment2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","D:\\eclipse-java-photon-R-win32-x86_64\\Browsers\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get("http://www.zlti.com");
	    driver.manage().window().maximize();
	    
	    
	    List<WebElement> linklist=driver.findElements(By.tagName("a"));
	    linklist.addAll(driver.findElements(By.tagName("img")));
	    
	    System.out.println("size of the full images :"+linklist.size());
	    ArrayList<WebElement> activelinks=new ArrayList<WebElement>();
	    ArrayList<WebElement> brokenlinks=new ArrayList<WebElement>();
	    
	   
	    for(int i=0;i<linklist.size();i++) 
	    {
	    	System.out.println(linklist.get(i).getAttribute("href"));
	    	if(linklist.get(i).getAttribute("href")!=null && (linklist.get(i).getAttribute("href").startsWith("http")))
	    	{
	    		activelinks.add(linklist.get(i));
	    	}
	    }
	    
	    System.out.println("size of the active links and images: "+activelinks.size());
	    System.out.println("CORRECT LINKS :");
	    for(int j=0;j<activelinks.size();j++)
	    {
	    	
    		System.out.println(j+"------------------------------");
    		System.out.println(activelinks.get(j).getAttribute("href"));
    		System.out.println("-------------------------------");
	    }
	    
	    for(int i=0;i<linklist.size();i++) 
	    {
	    	System.out.println(linklist.get(i).getAttribute("href"));
	    	if(linklist.get(i).getAttribute("href")==null && (!linklist.get(i).getAttribute("href").startsWith("http")))
	    	{
	    		brokenlinks.add(linklist.get(i));
	    	}
	    }
	    
	    System.out.println("BROKEN LINKS :");
	    for(int j=0;j<brokenlinks.size();j++)
	    {
	    	
    		System.out.println(j+"------------------------------");
    		System.out.println(brokenlinks.get(j).getAttribute("href"));
    		System.out.println("-------------------------------");
	    }

	}

}
