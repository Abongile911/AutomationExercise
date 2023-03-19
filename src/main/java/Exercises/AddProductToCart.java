package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AddProductToCart {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\abosh\\Downloads\\geckodriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        String baseURL = ("https://www.takealot.com/");
        driver.get(baseURL);

        WebElement login = driver.findElement(By.linkText("Login"));
        System.out.println("Clicking on the login element in the main page");
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("customer_login_email")).sendKeys("abosh931213@gmail.com");
        driver.findElement(By.id("customer_login_password")).sendKeys("sithole93");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));

        driver.findElement(By.xpath("//label[@class='rc-anchor-center-item rc-anchor-checkbox-label']")).click();
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("//button[text()='Got it']")).click();
        driver.findElement(By.xpath("//button[@class='button submit-action']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Pots");
        driver.findElement(By.className("input-group-button")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.className("mini-cart-button")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
