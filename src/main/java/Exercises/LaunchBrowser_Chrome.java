package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_Chrome {

    public static void main (String[] args){
        //Creating a driver object
        WebDriver driver;

        //Setting property to the executable driver location
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources.chromedriver.exe");

        //Instantiating the driver object
        driver = new ChromeDriver();

        //Load Web Application
        String baseURL = ("https://demo.guru99.com/test/newtours/");
        driver.get(baseURL);

        //Verify the actual tittle of the application
        System.out.println(driver.getTitle());

        //Print out the result

        //close the browser
        driver.close();



    }
}


