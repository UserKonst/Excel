/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static tests.DogTest.driver;

/**
 *
 * @author konst
 */
@Test
public class CatTest {
    
    public CatTest() {
        
    }
    
    public static WebDriver driver;
    
    @BeforeClass
    public void setup() {
        driver = AnimalTest.getDriver();
    }
    
    @BeforeMethod
    public void getUrl() {
      
        driver.get("http://www.ranorex.com/web-testing-examples/vip/");
       
    }
    
    @Test
    public void test1() {
        System.out.println("test1 cat");
        System.out.println("driver in Cat: " + driver);
        
    }
    
    @Test
    public void test2() {
        System.out.println("test2 cat");
    }
    
    @Test(priority = 1)
    public void test3() {
        System.out.println("test3 cat");
    }
    
}
