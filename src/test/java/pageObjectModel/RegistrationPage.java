package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	//Elements
	
	WebDriver driver;
	By getStarted=By.xpath ("//button[@class='btn']");
	By dropdownItem=By.	xpath("//div[@class='nav-item dropdown']");
	By selectdropdown=By.	xpath("//div[@class='dropdown-menu show']/a[3]");
	By mesg=By.	xpath("//div[@class='alert alert-primary']");
	By getStartedbtn=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]//a");
	By register=By.	xpath("//div[@class='navbar-nav'][2]/ul/a[2]");
	By userName=By.id("id_username");
	By password=By.id("id_password1");
	By confPassword=By.id("id_password2");
	By compregister=By.xpath("//input[@value='Register']");
	//By alert=By.xpath("//div[@class='alert alert-primary']");
    By signout=By.xpath("//a[@href='/logout']");
	By signin=By.xpath("//div[@class='navbar-nav'][2]/ul/a[3]");
	By login1=By.xpath("//input[@type='submit' @value='Login']");
	By userName1=By.id("id_username");
	By password1=By.id("id_password");
	By login=By.xpath("//input[@value='Login']");
	By alert=By.xpath("//div[@class='alert alert-primary']");
	
	//constructor
	public RegistrationPage(WebDriver d) {
		driver=d;
	}
	
	//Methods
	
	public void clickOnGetStarted() {
		 driver.findElement(getStarted).isDisplayed();
		 driver.findElement(getStarted).click();
		}
	public void clickOnDropDown() {
		driver.findElement(dropdownItem).click();
		}

		public void selectFromDropDown() {
		driver.findElement(selectdropdown).click();
		}

		public String alertMesg() {
			String message =driver.findElement(mesg).getText();
			return message;
		}

		public void clickGetStartedBtnHome() {
		driver.findElement(getStartedbtn).isDisplayed();
		driver.findElement(getStartedbtn).click();
		}

		public void clickOnRegister() {
		driver.findElement(register).isDisplayed();
		driver.findElement(register).click();

		}
	public void enterUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
	}
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}
	public void enterConfirmPswd(String cpswd) {
		driver.findElement(confPassword).sendKeys(cpswd);
	}
	
	public void clickOncompRegister() {
		driver.findElement(register).isEnabled();
		driver.findElement(register).click();
	}
	/*public  String alert() {
		String mesg=driver.findElement(alert).getText();
		return mesg;
	}*/
	public void clickOnSignout() {
		driver.findElement(signout).isDisplayed();
		driver.findElement(signout).click();
	}
	public void clickOnSignin() {
		driver.findElement(signin).isDisplayed();
		driver.findElement(signin).click();
	}
	/*public void clickOnLogin() {
		//driver.findElement(login).isDisplayed();
		driver.findElement(login).click();
	}*/
	
	public void enterUserName1(String uName) {
		driver.findElement(userName1).sendKeys(uName);
	}
	public void enterPassword1(String pswd) {
		driver.findElement(password1).sendKeys(pswd);
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	public String alert() {
		String mesg=driver.findElement(alert).getText();
		return mesg;
	}
}
	