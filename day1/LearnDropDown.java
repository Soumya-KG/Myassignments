package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To select the drop down value for industry
				//1.Find the element
			    //2.Use select class to click the element
				
				WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select drop=new Select(source);
				drop.selectByIndex(2);
				
				
				WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select opt=new Select(industry);
				opt.selectByIndex(3);
				
				//Select using value and visible text
				WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select option=new Select(ownership);
				option.selectByValue("OWN_PROPRIETOR");
				option.selectByVisibleText("Sole Proprietorship");
		
		

	}

}
