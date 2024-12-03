package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-firstname")).sendKeys("Sohail");
        driver.findElement(By.id("input-lastname")).sendKeys("Aftab");
        driver.findElement(By.id("input-email")).sendKeys("sohail4@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9800591748");
        driver.findElement(By.id("input-password")).sendKeys("123456789");
        driver.findElement(By.id("input-confirm")).sendKeys("123456789");

        driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
        driver.findElement(By.name("agree")).click();

        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String tagLine = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
        if(tagLine.equals("Congratulations! Your new account has been successfully created!")){
            System.out.println("Text matched");
        }else{
            System.out.println("Text invalid");
        }
    }
}
