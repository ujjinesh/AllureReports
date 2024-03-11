package com.Fakedata;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMrs {

	public static void main(String[] args) throws Throwable {
		
		TestData testdata = new TestData();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		driver.findElement(By.xpath("//li[text()='Inpatient Ward']")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		String loginpage = driver.findElement(By.xpath("//h4[text()]")).getText();
		System.out.println(loginpage);

		driver.findElement(By.xpath("//i[@class='icon-user']")).click();
		driver.findElement(By.xpath("//input[@name='givenName']")).sendKeys(testdata.getGivenName());
		driver.findElement(By.xpath("//input[@name='familyName']")).sendKeys(testdata.getFamilyName());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='confirm right']")).click();

		Thread.sleep(2000);

	    driver.findElement(By.xpath("//select[@id='gender-field']")).sendKeys(testdata.getGender());
		driver.findElement(By.xpath("//button[@class='confirm right']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='birthdateDay-field']")).sendKeys(String.valueOf(testdata.getDate()));
		driver.findElement(By.xpath("//select[@id='birthdateMonth-field']")).sendKeys(GetterAndSetters.generateRandomMonth());
		driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("19"+ testdata.getYear());
		driver.findElement(By.xpath("//button[@class='confirm right']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(testdata.getAddress1());
		driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(testdata.getAddress2());

		driver.findElement(By.xpath("//input[@id='cityVillage']")).sendKeys(testdata.getVillage());
		driver.findElement(By.xpath("//input[@id='stateProvince']")).sendKeys(testdata.getState());
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys(testdata.getCountry());
		driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys(testdata.getPostalcode());
		driver.findElement(By.xpath("//button[@class='confirm right']")).click();

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(testdata.getPhonenumber());
		driver.findElement(By.xpath("//button[@class='confirm right']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='relationship_type']")).sendKeys(testdata.getRelationship_type());
		driver.findElement(By.xpath("//input[@placeholder='Person Name']")).sendKeys(testdata.getPersonName());
		driver.findElement(By.xpath("//button[@class='confirm right']")).click();

		Thread.sleep(2000);
		String Register_a_patient = driver.findElement(By.xpath("//h2[text()]")).getText();
		System.out.println(Register_a_patient);
		driver.findElement(By.xpath("//input[@id='submit']")).click();
		Thread.sleep(2000);
		String Patient_ID = driver.findElement(By.xpath("//em[text()='Patient ID']//following-sibling::span[text()]"))
				.getText();
		System.out.println("Patient_ID :" + Patient_ID);

		driver.findElement(By.xpath("//a[@href='/openmrs/index.htm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-search']")).click();

		driver.findElement(By.xpath("//input[@id='patient-search']")).sendKeys(Patient_ID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Recent']")).click();

		String Contact_Info = driver.findElement(By.xpath("//span[text()='Show Contact Info']")).getText();
		System.out.println(Contact_Info);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a/i")).click();
		
		driver.close();

	}

}
