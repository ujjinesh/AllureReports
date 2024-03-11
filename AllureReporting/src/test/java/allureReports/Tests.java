package allureReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

@Listeners({AllureListener.class})
public class Tests extends BaseClass{


	public WebDriver driver;

	@BeforeClass
	public void setUp() {
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://demo.openmrs.org/openmrs/referenceapplication/login.page");

	}

	@Test(priority = 1, description = "Verify Logo presence on Home Page")
	@Description("Verify Logo presence on Home Page........")
	@Severity(SeverityLevel.MINOR)
	@Owner("Bandi Ujjinesh")
	@Epic("E001")
	@Feature("Feature1: Logo")
	@Story("Story:Logo Presence")
	@Step("Verify logo Presence")
	@Link(name = "OpenMRS", url = "https://demo.openmrs.org/openmrs/referenceapplication/login.page")
	public void logoPresence() throws InterruptedException {
		boolean dispStatus = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/header/div/a/img"))
				.isDisplayed();
		Assert.assertEquals(dispStatus, true);
	}

	@Test(priority = 2, description = "Verify login page Title")
	@Description("Verify login with Valid Credentials........")
	@Severity(SeverityLevel.CRITICAL)
	@Owner("Bandi Ujjinesh")
	@Epic("EP001")
	@Feature("Feature2: Login")
	@Story("Story:Valid login")
	@Step("Verify login")
	@Link(name = "OpenMRS", url = "https://demo.openmrs.org/openmrs/referenceapplication/login.page")
	public void loginTest() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Admin123");
		driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		Assert.assertEquals(driver.getTitle(), "Home123");

	}

	@Test(priority = 3, description = "Verify user Registration")
	@Description("Verify user Registration........")
	@Severity(SeverityLevel.NORMAL)
	@Owner("Bandi Ujjinesh")
	@Epic("EP001")
	@Feature("Feature3: Registration")
	@Story("Story:User registration")
	@Link(name = "OpenMRS", url = "https://demo.openmrs.org/openmrs/referenceapplication/login.page")
	public void registrationTest() {
		throw new SkipException("Skipping this Test");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
