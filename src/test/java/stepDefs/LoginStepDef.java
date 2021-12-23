package stepDefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
	@Given("User is already on login page")
	public void User_is_already_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
//	@When("User_enters_login_credentials")
//	public void User_enters_login_credentials() {
//		driver.findElement(By.name("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.cssSelector(".radius")).click();
//		
//	}	
	
	//for multiple set of data
//	@When("User enters {string} and {string}")
//	public void User_enters_and(String strUser, String strPwd) {
//		driver.findElement(By.name("username")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".radius")).click();
//		
//	}	
//	
	//For step wise data
	//DataTable as list -> when only few records are there
//	@When("User enters login credentials")
//	public void User_enters_login_credentials(DataTable userCred) {
//		List<List<String>> data = userCred.asLists();
//		//record1 - username,pwd
// 		//record2 - username,pwd
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.cssSelector(".radius")).click();
//		
//	}
	
	//DataTable as Maps
	//MAPS is used when we have too many data and index cant be remembered and cannot be used with the help of index therefore we have to use
	///maps with the help of key value pair.
	@When("User enters login credentials")
	public void User_enters_login_credentials(DataTable userCred) {
		List<Map<String, String>> data = userCred.asMaps();
		//record1 - username,pwd
 		//record2 - username,pwd
		driver.findElement(By.name("username")).sendKeys(data.get(0).get("strUser"));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get("strPwd"));
		driver.findElement(By.cssSelector(".radius")).click();
		
	}
	
	@Then("User is on Home Page")
	public void User_is_on_Home_Page() {
		boolean isValidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		Assert.assertTrue(isValidUser);
	}
}
