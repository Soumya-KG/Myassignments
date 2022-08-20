package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnRelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.	manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Lead]")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sow");
	driver.findElement(By.xpath("//[input[@id='createLeadForm_lastName']")).sendKeys("Kg");
	driver.findElement(By.xpath("//[input[@class='smallSubmit']")).click();
	String title=driver.getTitle();
	
		
		
		
		
		
	}

}
