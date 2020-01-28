package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	public static WebDriver driver;
	PageObjects po;
	@Given("^Navigate to Home page$")
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		po= new PageObjects(driver);
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	}
	
	@When("^user enters username and password$")
	public void unameandpswd() {
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.login.click();		
	}
	
	@Then("^user logged in successfully$")
	public void Loginsuccessfull() {
		System.out.println("User login successfully");	
	}
	
	
	@When("^Larry searches below products in the search box:$")
	public void Search(DataTable dt) {
		List<String> product = dt.asList(String.class);
		for(String s: product) {
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
			//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		//	driver.findElement(By.xpath("/html/body/header/div/b/a[1]")).click();
		//	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[3]")).click();
			
		}
	}
	 @When("^i enter \"([^\"]*)\" and \"([^\"]*)\"$")
	
		 public void unameandpwd(String uname,String pwd) {
				po.signin.click();
				po.username.sendKeys(uname);
				po.password.sendKeys(pwd);
				po.login.click();		
			}
	
	@Then("^product should be added in the cart if available$")
	public void productadded() {
		
	}
}
