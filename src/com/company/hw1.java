package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        Thread.sleep(700);
        driver.manage().window().maximize();
        Thread.sleep(700);
        WebElement firstName= driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Big Daddy Woo Woo");
        Thread.sleep(700);
        WebElement lastName= driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Johnson Boy Smith The 3rd");
        Thread.sleep(700);
        WebElement address= driver.findElement(By.id("customer.address.street"));
        address.sendKeys("2021 Batch11 St.");
        Thread.sleep(700);
        WebElement city= driver.findElement(By.id("customer.address.city"));
        city.sendKeys("The north pole");
        Thread.sleep(700);
        WebElement state= driver.findElement(By.id("customer.address.state"));
        state.sendKeys("Of the Colombian Mountains");
        Thread.sleep(700);
        WebElement zipCode= driver.findElement(By.id("customer.address.zipCode"));
        zipCode.sendKeys("12345");
        Thread.sleep(700);
        WebElement phoneNumber=driver.findElement(By.id("customer.phoneNumber"));
        phoneNumber.sendKeys("321-321-3213");
        Thread.sleep(700);
        WebElement socialSecurityNumber=driver.findElement(By.id("customer.ssn"));
        socialSecurityNumber.sendKeys("321-32-1321");
        Thread.sleep(700);
        WebElement userName=driver.findElement(By.id("customer.username"));
        userName.sendKeys("TimmyTenders");
        Thread.sleep(700);
        WebElement password= driver.findElement(By.id("customer.password"));
        password.sendKeys("TheyLLNeverKnow");
        Thread.sleep(700);
        WebElement confirmPassword=driver.findElement(By.id("repeatedPassword"));
        confirmPassword.sendKeys("TheyLLNeverKnow");
        Thread.sleep(700);
        WebElement registerButton=driver.findElement(By.className("button"));
        registerButton.click();
        Thread.sleep(1500);
        driver.quit();
       
    }
}
