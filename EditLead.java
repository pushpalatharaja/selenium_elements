package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on the Login Button.
		driver.findElement(By.className("decorativeSubmit")).click();
		

		//Click on the CRM/SFA Link.
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on the Leads Button.
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		
		//Click on Create Lead.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Cognizant");
		
		//Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pushpalatha");
		
		
		//Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raja");
		
		
		//Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("KPL");
		
		//Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		
		
		//Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Hello..");
		
		
		//Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement select_element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select select_obj=new Select(select_element);
		select_obj.selectByVisibleText("New Jersey");
		
		
		//Click on the Create Button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				
		//Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description Field.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		
		//Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Important text.....");
		
		//Click on the update button.
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the Title of the Resulting Page.
		System.out.println(driver.getTitle());
		
		//Close the browser window
		driver.close();
		

	}

}
