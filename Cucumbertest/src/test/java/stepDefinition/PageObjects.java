package stepDefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
WebDriver driver;
public PageObjects(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath=("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a"))
public  WebElement signin;

@FindBy(name="userName")
public  WebElement username;

@FindBy(name="password")
public  WebElement password;

@FindBy(name="Login")
public WebElement login;
}
