package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationPageTest {

	@Test
	
		 public void Verifyreg() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TU\\eclipse-workspace\\Hello-world\\src\\test\\resources\\drivers\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 RegistrationPage RGPage= new RegistrationPage (driver);

    Thread.sleep(4000);
	driver.get("https://dsportalapp.herokuapp.com/");	
	driver.manage().window().maximize();
	
	
	
	RGPage.clickOnGetStarted();
	RGPage.clickOnDropDown();
	RGPage.selectFromDropDown();
	RGPage.clickGetStartedBtnHome();
	RGPage.clickOnRegister();
	RGPage.enterUserName("FeminaJosh");
	RGPage.enterPassword("qwertyui@0");
	RGPage.enterConfirmPswd("qwertyui@0");
	RGPage.clickOncompRegister();
	//RGPage.alert();
	RGPage.clickOnSignin();
	RGPage.clickOnLogin();
	RGPage.enterUserName1("FeminaJosh");
	RGPage.enterPassword1("qwertyui@0");
	RGPage.clickOnLogin();
	RGPage.clickOnSignout();

	
	}
	}
