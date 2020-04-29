package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static java.lang.Thread.*;
import static org.junit.Assert.assertTrue;

public class AppTest 
{
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }

//    @Test
//    public void seleniumExampleTest() throws InterruptedException{
//        driver.manage().window().maximize();
//        sleep(2000);
//        driver.get("http://www.google.co.uk");
//        sleep(1000);
//        WebElement googleSearchBar = driver.findElement(By.name("q"));
//        googleSearchBar.sendKeys("funny dog pics");
//        sleep(2000);
//        googleSearchBar.submit();
//        WebElement linkToPictures = driver.findElement(By.partialLinkText("Images for funny dog"));
//        linkToPictures.click();
//        sleep(2000);
//        WebElement imagesLink = driver.findElement(By.className("NZmxZe"));
//        assertTrue(imagesLink.isDisplayed());
//
//        imagesLink.getLocation();
//        imagesLink.getSize();
//        imagesLink.getText();
//        imagesLink.isDisplayed();
//        imagesLink.isSelected();
//    }

//    @Test
//    public void seleniumDemoLoginTest() throws InterruptedException{
//        driver.manage().window().maximize();
//        sleep(2000);
//        driver.get("http://thedemosite.co.uk/addauser.php");
//        sleep(1000);
//        WebElement demoUsernameCreate = driver.findElement(By.name("username"));
//        demoUsernameCreate.sendKeys("BigBoi");
//        WebElement demoPassCreate = driver.findElement(By.name("password"));
//        demoPassCreate.sendKeys("BigPass");
//        driver.findElement(By.name("FormsButton2")).click();
//        sleep(2000);
//
//        driver.get("http://thedemosite.co.uk/login.php");
//        WebElement demoUsernameInput = driver.findElement(By.name("username"));
//        demoUsernameInput.sendKeys("BigBoi");
//        WebElement demoPassInput = driver.findElement(By.name("password"));
//        demoPassInput.sendKeys("BigPass");
//        driver.findElement(By.name("FormsButton2")).click();
//        sleep(2000);
//        String bodyText = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
//        assertTrue("Successful Login", bodyText.contains("Successful Login"));
//    }

//    @Test
//    public void seleniumDrawHouseTest() throws InterruptedException {
//        driver.manage().window().maximize();
//        driver.get("https://www.youidraw.com/apps/painter/");
//        sleep(5000);
//        Actions action = new Actions(driver);
//        action.moveByOffset(233, 12).click().perform();
//        sleep(1000);
//        action.click().perform();
//        sleep(1000);
//        action.click().perform();
//        sleep(1000);
//        action.click().perform();
//        sleep(1000);
//        action.moveByOffset(-233, -12).perform();
//        action.moveByOffset(700, 560).clickAndHold().moveByOffset(0, -200).perform();
//        action.clickAndHold().moveByOffset(100, -50).perform();
//        action.clickAndHold().moveByOffset(100, 50).perform();
//        action.clickAndHold().moveByOffset(0, 200).perform();
//        action.clickAndHold().moveByOffset(-200, 0).perform();
//        action.release().perform();
//
//        action.moveByOffset(200, 0).clickAndHold().moveByOffset(60, -20).perform();
//        action.clickAndHold().moveByOffset(0, -200).perform();
//        action.clickAndHold().moveByOffset(-60, 20).perform();
//        action.clickAndHold().moveByOffset(60, -20).perform();
//        action.clickAndHold().moveByOffset(-100, -50).perform();
//        action.clickAndHold().moveByOffset(-60, 20).perform();
//        action.release().perform();
//        sleep(10000);
//    }

    @After
    public void tearDown(){
        driver.close();
    }
}
