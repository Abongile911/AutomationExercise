package Exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main (String[] args){

        //Setting property to the executable driver location
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources.chromedriver.exe");

        //Instantiating the driver object
        WebDriver driver = new ChromeDriver();

        //Load Web Application
        String baseURL = ("https://demo.guru99.com/test/guru99home/");
        driver.get(baseURL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String pageTitle = driver.getTitle();

        //Verify Commands
        if(pageTitle.contentEquals("Demo Guru99 Page")){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is absent");
        }


        //close the browser
        driver.close();



    }

}
