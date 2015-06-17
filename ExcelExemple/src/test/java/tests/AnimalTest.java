/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 *
 * @author konst
 */
public class AnimalTest {

    public AnimalTest() {
    }

    public static WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void before() throws InterruptedException {
        System.out.println("BEFORE");

//        File file = new File("E:\\ffprofile");
//        FirefoxProfile profile = new FirefoxProfile(file);
//        driver = new FirefoxDriver(profile);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
        driver = new HtmlUnitDriver();
        System.out.println("dirver in before: " + getDriver());
        driver.get("http://www.ranorex.com/web-testing-examples/vip/");

    }

    public static WebDriver getDriver() {
        return driver;
    }

    @AfterTest(alwaysRun = true)
    public void after() {
        System.out.println("AFTER");
        driver.quit();
    }

}
