package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webOrder {
    public static void main(String[] args){

           System.setProperty("webdriver.geckodriver.driver", "Driver/firefox.exe");
           WebDriver driver=new FirefoxDriver();
           driver.get("https://demoqa.com/text-box");
        WebElement TextBox=driver.findElement(By.className("form-control"));
        TextBox.sendKeys("GangGangGang");

    }
}
