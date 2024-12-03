//account-details to login
//sohail10@gmail.com
//1234

package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        String email = "sohail10@gmail.com";
        String password = "1234";

        driver.findElement(By.id("input-email")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//a[@title='My Account' and @class='dropdown-toggle']"));
        js.executeScript("arguments[0].click();",element);

        Boolean isLogout = driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled();
        System.out.println(isLogout);

        if(isLogout == true){
            System.out.println("Logout is present");
        }else{
            System.out.println("Logout is not present");
        }

    }
}
