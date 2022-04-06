package Zadania0304;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Zadanie5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        driver.get("https://hotel-testlab.coderslab.pl/en/");


        WebElement SigninButton = driver.findElement(By.className("user_login"));

        SigninButton.click();
        WebElement enterYourEmailInput = driver.findElement(By.id("email_create"));
        enterYourEmailInput.sendKeys("test@1226.com");

        WebElement CreateAccountButton = driver.findElement(By.id("SubmitCreate"));
        CreateAccountButton.click();


        WebElement FirstNameInput = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));

        WebElement LastNameInput = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));

        WebElement PasswordInput = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailInput.clear();



// wyszukanie password
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("qwerty12345");



        String userEmail = "test@1248.com";

        emailInput.sendKeys(userEmail);

        FirstNameInput.sendKeys("Chuck");
        LastNameInput.sendKeys("Norris");

        // wyszukanie przycisku Register i klikniecie
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();


        //dodatkowe elementy do zadania 6

        WebElement MyPersonalInformation = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > span"));
        MyPersonalInformation.click();

        WebElement MyAddresses = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > i"));
        MyAddresses.click();


        //
        if (FirstNameInput.isDisplayed()) {
            FirstNameInput.sendKeys("Chuck");
            FirstNameInput.submit();
        }
            else{
                throw new ElementNotInteractableException("First name input");

            }


        if (FirstNameInput.isDisplayed()) {
            LastNameInput.sendKeys("Norris");
            LastNameInput.submit();
        }
        else{
            throw new ElementNotInteractableException("Last name input");

        }

        if (emailInput.isDisplayed()) {
            emailInput.sendKeys(userEmail);
            emailInput.submit();
        }
        else{
            throw new ElementNotInteractableException(" Email input");

        }

        if (PasswordInput.isDisplayed()) {
            PasswordInput.sendKeys("qwerty12345");
            PasswordInput.submit();
        }
        else{
            throw new ElementNotInteractableException(" Password input");

        }


        WebElement RegisterAccountButton = driver.findElement(By.id("submitAccount"));
if (RegisterAccountButton.isDisplayed()) {
    RegisterAccountButton.click();
}
else {
    throw new ElementNotInteractableException(" not displayed babe");

}


        }


    }






