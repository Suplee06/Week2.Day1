package seleniumKickoff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver=new ChromeDriver();
		
		Driver.get("https://en-gb.facebook.com/");
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Driver.findElement(By.linkText("Create New Account")).click();
		
		Driver.findElement(By.name("firstname")).sendKeys("Suresh");
		Driver.findElement(By.name("lastname")).sendKeys("Suplee");
		Driver.findElement(By.name("reg_email__")).sendKeys("9952724424");
		Driver.findElement(By.id("password_step_input")).sendKeys("LLLLoLLLL");
		
		WebElement Drp1 = Driver.findElement(By.id("day"));
		Select Dropdown1=new Select(Drp1);
		Dropdown1.selectByIndex(4);
		
		WebElement Drp2 = Driver.findElement(By.id("month"));
		Select Dropdown2=new Select(Drp2);
		Dropdown2.selectByIndex(5);
		
		WebElement Drp3 = Driver.findElement(By.id("year"));
		Select Dropdown3=new Select(Drp3);
		Dropdown3.selectByVisibleText("2017");
		
		Driver.findElement(By.name("sex"));
	//	Driver.findElementByLinkText("Sign Up");
		
		Driver.close();
		
	}
		
		

}
