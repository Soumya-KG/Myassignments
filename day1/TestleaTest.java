package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestleaTest {
	

	public static void main(String[] args) {
		//Connect with driver
		
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximise the browser
		driver.manage().window().maximize();
		
		//to wait for the browser to load to next pages
		//to wait for the driver to locate the element
		driver.manage().window().maximize();
		
		//Enter the User Name
		//you are telling the driver to go find out the element. 
		//If it finds out its called Webelement(return after checking)
		//if the value of the locator is not proper, it throws error as No such element
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//confirm the title of my webpage(when you move to next pages, you can see different web page names)
		String title=driver.getTitle();
		System.out.println(title);
		
		//click on create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Company Name field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		//Enter first name field
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmya");
		
		//Enter Last Name filed
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kg");
		
		//Enter First Name(Local) field
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Skg");
		
		//Enter department field using locator of your choice
		driver.findElement(By.linkText("createLeadForm_departmentName")).sendKeys("Testing");
		
		//Enter description field using Locator of your choise
		driver.findElement(By.linkText("createLeadForm_description")).sendKeys("abcdef");
		
		//Enter your email in the email address filed using the locator
		driver.findElement(By.linkText("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		//Click on create button
		driver.findElement(By.className("Create Lead")).click();
		
		//Get the title of the resulting page
		String title1=driver.getTitle();
		System.out.println(title1);
		
		//To select the drop down value for industry
	//find the element
		//use"Select"class to click the element
		
	WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select opt=new Select(industry);
	opt.selectByIndex(3);
	
	//Select using value and visible text
	WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select option=new Select(ownership);
	option.selectByValue("OWN_PROPRIETOR");
	option.selectByVisibleText("Sole Proprietorship");

	
	
	
	
		
		
		//To close the browser
		driver.close();
		
		
		
	

	}

}
