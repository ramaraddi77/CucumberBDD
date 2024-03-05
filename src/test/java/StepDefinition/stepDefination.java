package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefination 
{
	WebDriver driver;
	@Given("User Opens the Browser and Enter the URL")
	public void user_opens_the_browser_and_enter_the_url() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Then("Login page should be dislayed")
	public void login_page_should_be_dislayed()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}

	@When("Login credentials are entered")
	public void login_credentials_are_entered() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("9632092368");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("ramaraddi@77");
		Thread.sleep(2000);
	}

	@Then("login button is clicked")
	public void login_button_is_clicked()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@And("Home page should be displayed")
	public void home_page_should_be_displayed()
	{
		String title2 = driver.getTitle();
		System.out.println(title2);
		Assert.assertEquals(title2, "Log in to Facebook");
		driver.quit();
	}


}
