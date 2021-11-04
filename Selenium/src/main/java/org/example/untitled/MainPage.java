package org.example.untitled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\kiemthu\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("https://facebook.com");
//        driver.findElement(By.cssSelector("input#email")).sendKeys("100008118781000");
//        driver.findElement(By.cssSelector("input#pass")).sendKeys("");
//        driver.findElement(By.name("login")).click();
//        driver.get("https://google.com");
//        WebElement inputSearch = driver.findElement((By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")));
//        inputSearch.clear();
//        inputSearch.sendKeys("Hani");
//        inputSearch.submit();
//        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
//        WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
//        email.clear();
//        email.sendKeys("phanminh118@gmail.com");
//        driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
        driver.get("https://hoclieu.vn");
        driver.findElement(By.cssSelector("#header > div > div > div:nth-child(1) > a")).click();
        WebElement email = driver.findElement(By.name("userName"));
        WebElement pass = driver.findElement(By.name("password"));
        email.clear();
        email.sendKeys("phanminh118");
        pass.clear();
        pass.sendKeys("123456");
        driver.findElement(By.cssSelector("#root > div.auth > div > div > div > form > div.row.mt-5 > button")).click();

    }

}