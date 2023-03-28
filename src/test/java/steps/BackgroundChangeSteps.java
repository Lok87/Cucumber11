package steps;


	import org.junit.Assert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class BackgroundChangeSteps {

	    WebDriver driver;
	    
	    @Given("\"Set SkyBlue Background\" button exists")
	    public void verifyButtonExists() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\subed\\OneDrive\\Desktop\\Cucumber\\Cucumber11\\drivers\\chromedriver.exe");
	        
	        driver = new ChromeDriver();
	        
	        driver.get("https://techfios.com/test/107/");
	        
	        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(), 'Set SkyBlue Background')]")).isDisplayed());
	    }

	    @When("I click on the button")
	    public void clickOnButton() {
	        driver.findElement(By.xpath("//button[contains(text(), 'Set SkyBlue Background')]")).click();
	    }

	    @Then("the background color will change to sky blue")
	    public void verifyBackgroundColor() {
	        String actualBackgroundColor = driver.findElement(By.tagName("body")).getCssValue("background-color");
	        Assert.assertEquals(actualBackgroundColor, "rgba(135, 206, 235, 1)");
	        
	        driver.quit();
	    }

	}

