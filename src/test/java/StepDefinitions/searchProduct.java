package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchProduct {
    WebDriver driver;

    @Given("lanching the chrome browser land on safety website")
    public void lanching_the_chrome_browser_land_on_safety_website() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.safeway.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("(//*[starts-with(@d,'M13')])[8]")).click();
        //driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
    }

    @When("navigate to search bar")
    public void navigate_to_search_bar() {
        driver.findElement(By.xpath("//input[@id='skip-main-content']"));
    }

    @Then("Enter the product name and click on the enter button")
    public void enter_the_product_name_and_click_on_the_enter_button() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='skip-main-content']")).sendKeys("chocolate chips", Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("close the browser")
    public void close_the_browser() {

        driver.quit();
    }

}
