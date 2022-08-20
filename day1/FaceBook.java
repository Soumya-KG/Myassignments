package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.	manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class=_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy]")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-]")).sendKeys("Sow");
		driver.findElement(By.xpath("//input[@class=inputtext _58mg _5dba _2ph-]")).sendKeys("kg");
		driver.findElement(By.xpath("//input[@class=inputtext _58mg _5dba _2ph-]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id=password_step_input]")).sendKeys("Ria");
		WebElement dateofBirth=driver.findElement(By.xpath("//select[@id=id=\"day\"]"));
		Select option=new Select(dateofBirth);
		option.selectByIndex(15);
		WebElement month=driver.findElement(By.xpath("//select[@id=month]"));
		Select drop=new Select(month);
		option.selectByValue("October");
		WebElement year=driver.findElement(By.xpath("//select[@id=year]"));
		Select drop1=new Select(year);
		option.selectByIndex(1986);
		driver.findElement(By.xpath("//label[@class=_58mt]")).click();
		
				
		
		
		
		
		
	}

}
