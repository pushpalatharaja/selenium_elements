package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		
		//enter username, password, click login
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on the "Accounts" tab
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
				
		//Click on the "Create Account" button
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
				
		//Enter an account name
		driver.findElement(By.id("accountName")).sendKeys("Pushpalatha_R");
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		
		
		//Select "ComputerSoftware" as the industry.
		WebElement select_industry = driver.findElement(By.xpath("//option[@value='IND_AEROSPACE']/parent::select"));
		Select select_obj=new Select(select_industry);
		select_obj.selectByVisibleText("Computer Software");
		
				
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement select_ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select select_obj1=new Select(select_ownership);
		select_obj1.selectByVisibleText("S-Corporation");
				
		
		//Select "Employee" as the source using SelectByValue
		WebElement select_source= driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		Select select_obj2=new Select(select_source);
		select_obj2.selectByValue("LEAD_EMPLOYEE");
		
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement select_campaign= driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
		Select select_obj3=new Select(select_campaign);
		select_obj3.selectByIndex(7);
		
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement select_state= driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select select_obj4=new Select(select_state);
		select_obj4.selectByValue("TX");
		
		//Click the "Create Account" button
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[24]")).click();
		
		//Verify that the account name is displayed correctly.
		WebElement myName = driver.findElement(By.xpath("//table[@class='fourColumnForm']//tr[1]/td[@class='titleCell']/span/following::span[1]"));
		System.out.println("Print My Name:" + myName.getText() );
				
		
		//Close the browser window
		driver.close();
		
		
		
		
	}

}
