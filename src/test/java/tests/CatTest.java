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
    
    @Test(groups = {"gr1"}, priority = 3)
    public void test1() {
        System.out.println("test1 in group 1");
        System.out.println("driver in Cat: " + driver);
        
    }
    
    @Test(groups = {"gr1"}, priority = 2)
    public void test2() {
        System.out.println("test2 in gourp 1");
    }
    
    @Test(groups = {"gr1"}, priority = 1)
    public void test3() {
        System.out.println("test3 in group1");
    }
    
     @Test(groups = {"gr2"})
    public void test4() {
        System.out.println("test1 in group 2");
    }
    
     @Test(groups = {"gr2"})
    public void test5() {
        System.out.println("test2 in group 2");
    }
    
     @Test(groups = {"gr3"})
    public void test6() {
        System.out.println("test1 in group 3");
    }
    
      @Test(groups = {"gr3"})
    public void test7() {
        System.out.println("test2 in gourp 3");
    }
  
    
}
