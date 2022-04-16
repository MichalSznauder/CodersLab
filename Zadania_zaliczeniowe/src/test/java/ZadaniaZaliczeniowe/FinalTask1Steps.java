package ZadaniaZaliczeniowe;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class FinalTask1Steps {

    private WebDriver driver;

    @Given("user is logged in on mystore page")
    public void userIsLoggedInOnMystorePage() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account");
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("znqocowprtbwttvupo@nvhrw.com");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("wertyq1");
        driver.findElement(By.id("submit-login")).click();
    }


    @When("user click Create new address")
    public void userClickCreateNewAddress() {

        driver.findElement(By.xpath("//*[@id=\"address-link\"]")).click();

    }


    @When("user fills New Address form with data {string}, {string}, {string}, {string},{string}")
    public void userFillsNewAddressFormWithData(String alias, String address, String city, String postalCode, String phone) {


    driver.findElement(By.name("alias")).sendKeys(alias);
    driver.findElement(By.name("address1")).sendKeys(address);
    driver.findElement(By.name("city")).sendKeys(city);
    driver.findElement(By.name("postcode")).sendKeys(postalCode);
    driver.findElement(By.name("phone")).sendKeys(phone);

        WebElement countryDropdown = driver.findElement(By.name("id_country"));
        Select daySelect = new Select(countryDropdown);
        daySelect.selectByValue("United Kingdom");
    }



    @And("click Save button to add first address")
    public void clickSaveButtonToAddFirstAddress() {

        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div/div/form/footer/button")).click();

    }

    @Then("first address is added")
    public void firstAddressIsAdded() {
    }

    @And("the data is validated")
    public void theDataIsValidated() {
        
    }

    @And("the address is removed")
    public void theAddressIsRemoved() {
        
    }

    @And("checks if address is removed")
    public void checksIfAddressIsRemoved() {
    }


}
