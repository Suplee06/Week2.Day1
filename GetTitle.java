package seleniumKickoff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();

		Driver.get("http://leaftaps.com/opentaps/control/main");

		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String text = Driver.getTitle();
		
		Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		Driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Driver.findElement(By.className("decorativeSubmit")).click();
		
		Driver.findElement(By.linkText("CRM/SFA")).click();
		

		String HomeTitle =Driver.getTitle();
		String Title ="My Home | opentaps CRM";
		
		if(Title.equals(HomeTitle)) {
			System.out.println("in the homepage page");
		}else
		{
			System.out.println("not in the homepage");
		}
		
		
	//	Driver.close();

	}

}
