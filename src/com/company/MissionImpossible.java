package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MissionImpossible {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.amazon.com");
        String url=driver.getCurrentUrl();
        System.out.println("Current URL is : "+url);
        String title=driver.getTitle();
        System.out.println("Current title is : "+title);
        driver.close();


    }
}