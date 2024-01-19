package mateusaniceto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage{

    private static final By btnPlaceOrder =
            By.cssSelector("#cart_items > div > div:nth-child(7) > a");

    public static void clicarBtnPlaceOrder() {
        esperarElementoSerClicavel("#cart_items > div > div:nth-child(7) > a");
        scroll(btnPlaceOrder);
        clicar(btnPlaceOrder);
    }

}
