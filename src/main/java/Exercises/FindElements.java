package Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class FindElements {

    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();
        String baseURL = ("https://demoqa.com/automation-practice-form");
        driver.get(baseURL);

        //Find Elements
        driver.findElement(By.id("firstName")).sendKeys("Abongile");
        driver.findElement(By.id("lastName")).sendKeys("Sithole");
        driver.findElement(By.id("userEmail")).sendKeys("sitholeabo@gmail.com");

        driver.findElement(By.name("gender"));
        driver.findElement(By.cssSelector("#gender-radio-1 +label")).click();
        driver.findElement(By.cssSelector("#gender-radio-1 +label")).click();
        driver.findElement(By.cssSelector("#gender-radio-1 +label")).click();

       driver.findElement(By.id("userNumber")).sendKeys("0733441642");
       driver.findElement(By.id("dateOfBirth")).click();
       //driver.findElement(By.id("subjects")).sendKeys("Accounting English");


        //driver.findElement(By.id("currentAddress")).sendKeys("125 Wale Street");


      //List ClassRadioButton = driver.findElements(By.id("hobbies-checkbox-1"));


      //driver.findElement(By.id("Sport")).click();
       //driver.findElement(By.id("Reading")).click();
       //driver.findElement(By.id("Music")).click();



        //Create a boolean variable which will hold the value (True/False)
        //Boolean RadioButtonValue = false;


        //close the browser
        driver.close();

    }
}
