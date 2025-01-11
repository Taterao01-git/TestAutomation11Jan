package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FacebookRegSteps {
	static WebDriver driver;

	@Given("user is on register page")
	public void user_is_on_register_page() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/reg");

	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(password);
	}

	@When("user select {string} and {string} and {string}")
	public void user_select_and_and(String date, String month, String year) {
		WebElement datewb = driver.findElement(By.name("birthday_day"));

		Select sel = new Select(datewb);
		sel.selectByVisibleText(date);

		WebElement monthwb = driver.findElement(By.name("birthday_month"));
		Select selMonth = new Select(monthwb);
		selMonth.selectByVisibleText(month);

		WebElement YearWb = driver.findElement(By.name("birthday_year"));

		Select selYear = new Select(YearWb);
		selYear.selectByVisibleText(year);

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {


	}

}
