package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NopCommerceLogin {
  WebDriver driver;
  
	@Given("openBrowser and enter Url")
	public void open_browser_and_enter_url() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");  
	}
	@When("user entered valid username")
	public void user_entered_valid_username() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");  
	}

	@When("user Enter valid password")
	public void user_enter_valid_password() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");  
	}

	@When("user clicked on loginBtn")
	public void user_clicked_on_login_btn() {
	  driver.findElement(By.tagName("button")).click();
	}

	@Then("It should  naviagte to Dashboard page")
	public void it_should_naviagte_to_dashboard_page() {
	 String ActualValue= driver.findElement(By.xpath("(//h1)[2]")).getText();
	 String ExpectedValue="Dashboard";
	 Assert.assertEquals(ExpectedValue, ActualValue);
	}
	@Given ("openbrowser and enterUrl")
	public void open_browser_and_enterUrl() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");  
	}
	@When ("user entered invalid username")
	public void user_entered_invalid_username1() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@store.com");  
	}
   @ And ("user Enterd invalid password")
   public void user_Enterd_invalid_password() {
	   driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("1234");  
   }
   @When("user clicked on log button")
	public void user_clicked_on_login_button1() {
	  driver.findElement(By.tagName("button")).click();
   }
   @Then("it should throw error as {string}")
   public void it_should_throw_error_as1(String string) {
	 String actualValue= driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]")).getText();
	 String ExpectedValue="No customer account found";
Assert.assertEquals(ExpectedValue, actualValue);
   }
  @Given("openbrowser and enteru url")
  public void openbrowser_and_enteru_url() {
	  driver=new ChromeDriver();
    	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");  
  }
  @When("user entere valid username")
  public void user_entere_valid_username() {
driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
  }
  @When("User Enterd invalid password")
  public void user_enterd_invalid_password() {
     driver.findElement(By.id("Password")).clear();
     driver.findElement(By.id("Password")).sendKeys("7890");
  }
@When("user clicked on log buttone")
  public void user_clicked_on_log_buttone() {
	driver.findElement(By.tagName("button")).click(); 
  }
  @Then("It should throw error as {string}")
  public void it_should_throw_error_as11(String string) {
     String ActualValue=  driver.findElement(By.xpath("//li[contains(text(),'The credentials provided are incorrect')]")).getText();
     String ExpectedValue="The credentials provided are incorrect";
     Assert.assertEquals(ActualValue, ExpectedValue);
  }
  @Given("openbrowser and enterurl")
  public void openbrowser_and_enterurl() {
	  driver=new ChromeDriver();
 	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");  
  }

  @When("user Entered invalid username")
  public void user_entered_invalid_username() {
	  driver.findElement(By.id("Email")).clear();
	  driver.findElement(By.id("Email")).sendKeys("admin@store.com");  
  }

  @When("User Enterd valid password")
  public void user_enterd_valid_password() {
	  driver.findElement(By.id("Password")).clear();
  driver.findElement(By.id("Password")).sendKeys("admin");

  }
  
  @When("user clicke on log button")
  public void user_clicke_on_log_button() {
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
  }

  @Then("it should throw errors as {string}")
  public void it_should_throw_errors_as(String string) {
	  String ActualValue=  driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]")).getText();
    String ExpectedValue="No customer account found";
    Assert.assertEquals(ActualValue, ExpectedValue);
  }
  @Given("openbrowser and entereUrl")
  public void openbrowser_and_entere_url() {
	  driver=new ChromeDriver();
	 	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");  
  }

  @When("user keep empty fileds  for user and password")
  public void user_keep_empty_fileds_for_user_and_password() {
      driver.findElement(By.id("Email")).clear();
      driver.findElement(By.id("Email")).sendKeys("");
      driver.findElement(By.id("Password")).clear();
      driver.findElement(By.id("Password")).sendKeys("");
  }

  @When("user clicked on login button")
  public void user_clicked_on_login_button() {
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
  }
  @Then("it should  throw  error as {string}")
  public void it_should_throw_error_as(String string) {
   driver.findElement(By.id("Email-error")).click();
  }
}
