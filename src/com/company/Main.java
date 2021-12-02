package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        //set the path to the driver executable
        //for windows users we will use .exe but mac users dont need an .exe
        //Error: The driver executable does not exist: (refers that the path to your driver is not correct)--> Check path
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // creating an object of the ChromeDriver
        WebDriver driver=new ChromeDriver();

        //calling a get method to get to a particular website
        driver.get("http://google.com");

        //returns the current URL loaded in the browser
        String url=driver.getCurrentUrl();
        System.out.println("The current URL loaded in the browser is: "+url);

        //returns the title of the current page in the browser
        String title=driver.getTitle();
        System.out.println("The current title of the page is: "+title);

        //close the browser
        driver.quit();





    }
}
