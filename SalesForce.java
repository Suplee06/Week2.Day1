package seleniumKickoff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		Driver.findElement(By.name("UserFirstName")).sendKeys("Suresh");
		Driver.findElement(By.name("UserLastName")).sendKeys("Suplee");
		Driver.findElement(By.name("UserEmail")).sendKeys("suplee@gmail.com");
		Driver.findElement(By.name("CompanyName")).sendKeys("zhoho");
		Driver.findElement(By.name("UserPhone")).sendKeys("9952724424");
		
		WebElement Drp1 = Driver.findElement(By.name("UserTitle"));
		Select Dropdown1=new Select(Drp1);
		//Dropdown1.selectByVisibleText("Sales Manager");
		Dropdown1.selectByIndex(1);
		
		WebElement Drp2 = Driver.findElement(By.name("CompanyEmployees"));
		Select Dropdown2=new Select(Drp2);
		Dropdown2.selectByValue("75");
		
		WebElement Drp3 = Driver.findElement(By.name("CompanyCountry"));
		Select Dropdown3=new Select(Drp3);
		Dropdown3.selectByVisibleText("Argentina");
		
		Driver.findElement(By.className("checkbox-ui")).click();
		
		//Driver.findElement(By.name("start my free trial")).click();
		
		
		Driver.close();
	}

}
