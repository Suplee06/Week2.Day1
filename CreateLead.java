package seleniumKickoff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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

		Driver.findElement(By.linkText("Leads")).click();

		Driver.findElement(By.linkText("Create Lead")).click();

		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");

		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suresh");

		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suplee");
		
		WebElement drop1= Driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdwn1 =new Select(drop1);
		drpdwn1.selectByIndex(1);
		
		WebElement drop2= Driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdwn2 =new Select(drop2);
		drpdwn2.selectByValue("9002");
		
		WebElement drop3= Driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdwn3 =new Select(drop3);
		drpdwn3.selectByVisibleText("Media");
		int sizedrpdwn3 =drpdwn3.getOptions().size();
		System.out.println("the dropdown options are " +sizedrpdwn3);

		//Driver.findElementByClassName("smallSubmit").click();

	}

}
