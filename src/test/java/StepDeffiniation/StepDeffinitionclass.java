package StepDeffiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDeffinitionclass {
	WebDriver driver;
	@Given("^open URLL$")
	public void open_URLL() throws Throwable {
		System.setProperty("WedDriver.Chrome.driver","C:\\Web driver\\chromedriver.exe");

		 driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		Thread.sleep(3000);
	}

	@Then("^Click on Cart linkKK$")
	public void click_on_Cart_linkKK() throws Throwable {
	 driver.findElement(By.xpath("//a[text()='Cart']")).click();
	 Thread.sleep(5000);
	}

	@Then("^verify Cart link working successfully$")
	public void verify_Cart_link_working_successfully() throws Throwable {
boolean	cart =   driver.findElement(By.xpath("//button[text()='Place Order']")).isDisplayed();
Assert.assertTrue(cart);
Thread.sleep(5000);
driver.close();
	}

	
	
}
