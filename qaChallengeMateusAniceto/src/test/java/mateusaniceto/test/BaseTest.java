package mateusaniceto.test;

import mateusaniceto.factory.seleniumFactory.SeleniumFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    SeleniumFactory seleniumFactory = new SeleniumFactory();

    @BeforeTest
    public void abrirNavegador() {
        seleniumFactory.initBrowser("https://automationexercise.com/");
    }

    @AfterTest
    public void fecharNavegador() {
        seleniumFactory.tearDown();
    }

}
