package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        //to maximize window
        //driver.manage().window().maximize();

        //to make window fullscreen (Basically F11)
        driver.manage().window().fullscreen();

    }
}
