package week2.home_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
			
		
				ChromeDriver driver = new ChromeDriver();
		
				// Load the url
				driver.get("https://en-gb.facebook.com/");
				
				//to maximize the window
				driver.manage().window().maximize();
								
				//Click on the Create new account button.
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
						
				Thread.sleep(5000);
				
				
				//Enter the First name.
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pushpalatha");
								
				//Enter the Surname.
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raja");
				
				//Enter the Mobile number or email address.
				driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9876543210");
				
				//Enter the New password.
				driver.findElement(By.id("password_step_input")).sendKeys("testleaf");
				
				//Handle all three dropdowns in Date of birth
				WebElement select_element1 = driver.findElement(By.id("day"));
				Select select_date=new Select(select_element1);
				select_date.selectByValue("1");
				
				WebElement select_element2 = driver.findElement(By.id("month"));
				Select select_mon=new Select(select_element2);
				select_mon.selectByVisibleText("Jan");
				
				WebElement select_element3 = driver.findElement(By.id("year"));
				Select select_year=new Select(select_element3);
				select_year.selectByVisibleText("2000");
				
							
				Thread.sleep(5000);
											
				
				//Select the radio button in Gender.
				driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
				
				
				//close
				driver.close();
				

	}

}
