/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author konst
 */
@Test
public class DogTest {

    public DogTest() {

    }

    public static WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = AnimalTest.getDriver();
    }

    public void test1() {
        System.out.println("test1 dog");
        System.out.println("driver in Dog: " + driver);
    }

    public void test2() {
        System.out.println("test2 dog");
    }

    public void test3() {
        System.out.println("test3 dog");
    }

}
