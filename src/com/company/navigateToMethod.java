package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class navigateToMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com"); // method that opens a page to specified website(not used to create new tabs/pages for a different specified page in your class body
        Thread.sleep(2000);
        driver.navigate().to("http://www.amazon.com"); //method that allows navigating to specified website
        Thread.sleep(2000);
        driver.navigate().back();  // navigates back to previous page
        Thread.sleep(2000);
        driver.navigate().forward(); // navigates a page forward
        Thread.sleep(2000);
        driver.close();

        //driver.close -->  Will close the current tab
        // driver.quit -->  Will close the whole browser


        //using NAVIGATE method we can move forward,backward and refresh the page
        //but using GET method we can not do that
    }
}
