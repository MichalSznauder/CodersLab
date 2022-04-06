package Zadania0304;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");



        WebElement SigninButton = driver.findElement(By.className("user_login navigation-link"));
        WebElement enterYourEmailInput = driver.findElement(By.id("email_create"));
    enterYourEmailInput.sendKeys("test@test.com");

    WebElement CreateAccountButton = driver.findElement(By.id("SubmitCreate"));

    SigninButton.click();



    }

}
