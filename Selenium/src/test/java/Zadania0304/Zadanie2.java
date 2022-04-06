package Zadania0304;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zadanie2 {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        WebElement searchNowButton = driver.findElement(By.name("search_room_submit"));
        WebElement enterYourEmailInput = driver.findElement(By.name("email"));
        WebElement SubscribeButton = driver.findElement(By.name("submitNewsletter"));

        hotelLocationInput.sendKeys("Warsaw");
        enterYourEmailInput.sendKeys("test@test.com");


        //driver.findElement(By.name("search_room_submit")).submit();
        searchNowButton.click();












    }
}
