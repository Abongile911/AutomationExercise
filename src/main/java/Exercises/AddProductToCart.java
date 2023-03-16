package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AddProductToCart {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String baseURL = ("https://www.takealot.com/");
        driver.get(baseURL);

        //ChromeOptions ops = new ChromeOptions();
        // ops.addArguments("--remote-allow-origins=*");


        WebElement login = driver.findElement(By.linkText("Login"));
        System.out.println("Clicking on the login element in the main page");
        login.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.findElement(By.id("customer_login_email")).sendKeys("abosh931213@gmail.com");
        //driver.findElement(By.id("customer_login_password")).sendKeys("sithole93");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));

        driver.findElement(By.xpath("//label[@class='rc-anchor-center-item rc-anchor-checkbox-label']")).click();

                driver.switchTo().defaultContent();




        driver.findElement(By.xpath("//button[text()='Got it']")).click();
        driver.findElement(By.xpath("//button[text()='Login']")).click();




    }

    }
