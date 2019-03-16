package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class Registration {
    WebDriver browser;
    WebDriverWait wait;


    @Given("^I am on site registration page")
    public void check() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver//chromedriver_win32//chromedriver.exe");
        browser = new ChromeDriver();
        wait = new WebDriverWait(browser, 20);
        browser.navigate().to("https://www.myntra.com/register?referer=https://www.myntra.com/");

     }

    @When("^I enter email as \"(.*)\"$")
    public void enterEmail(String arg1) { browser.findElement(By.name("email")).sendKeys(arg1);
    }

    @When("^I enter password as \"(.*)\"$")
    public void enterPassword(String arg1) { browser.findElement(By.name("password")).sendKeys(arg1);
    }

    @When("^I enter mobile as \"(.*)\"$")
    public void enterMobile(String arg1) { browser.findElement(By.name("mobile")).sendKeys(arg1);
    }


    @When("^I select the title")
    public void radio() { WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("female")));
        radio.click();
    }

    @When("^I click on register")
    public void button() { browser.findElement(By.className("register-register-button")).click();
    }

    @Then("^account is registered")
    public void checkID() {
        browser.close();
    }

}
