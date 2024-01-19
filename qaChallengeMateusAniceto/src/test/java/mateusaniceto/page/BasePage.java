package mateusaniceto.page;

import mateusaniceto.factory.seleniumFactory.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage extends Elements {

    static void preencherInput(By by, String text) {
        esperarElemento(by);
        element(by).sendKeys(text);
    }

    protected static void clicar(By by) {
        esperarElemento(by);
        element(by).click();
    }

    protected static String lerTexto(By by) {
        return element(by).getText();
    }

    protected static void hover(By by) {
        esperarElemento(by);
        action.moveToElement(element(by)).perform();
    }

    protected static void scroll(By by) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(by);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String pegarUrl() {
        return driver.getCurrentUrl();
    }


}
