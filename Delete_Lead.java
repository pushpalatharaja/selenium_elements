package week2.home_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Browser Launch
		ChromeDriver driver=new ChromeDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/. .");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		
		//Enter the username.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter the password.
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//Click the "crm/sfa" link.
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click the "Leads" link.
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		
		//Click "Find leads."
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']/li[2]")).click();
		
		
		//Enter the phone number.
		
		
		driver.findElement(By.xpath("//td[@class='x-table-layout-cell']//input[@name='phoneNumber']")).sendKeys("9999");
				
			
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//em[@unselectable='on']/button[text()='Find Leads']")).click();
		//implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//Capture the lead ID of the first resulting lead.
		driver.findElement(By.xpath("//div[contains(text(),'9999')]"));
		WebElement first_id = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		System.out.println("The First Resulting Id is: "+ first_id.getText());
		
		String gettxt_id = first_id.getText();
		
		//Click the first resulting lead.
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a")).click();
					
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		
		//Click "Find leads" again.
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		//Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(gettxt_id);
		
		
		
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//em[@unselectable='on']/button[text()='Find Leads']")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		WebElement record_display = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(record_display.getText());		
	
		
		//Close the browser.
		driver.close();
		
		
		
		
		

	}

}
