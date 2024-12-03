package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String source = driver.getPageSource();

        System.out.println( url + "title " + title + " " + source);
        if(source.contains("webhvhp")){
            System.out.println("Contains");
        } else {
            System.out.println("Does not Contains");
        }
        //driver.quit();
        //driver.close();
    }
}
