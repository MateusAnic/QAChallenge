package mateusaniceto.page;

import org.openqa.selenium.By;

public class CartPage extends BasePage{

    private static final By btnProceedToCheckout =
            By.cssSelector("#do_action > div.container > div > div > a");

    private static final By btnRemoverMenTshirt =
            By.cssSelector("#product-2 > td.cart_delete > a");

    public static void clicarBtnCheckout() {
        esperarElementoSerClicavel("#do_action > div.container > div > div > a");
        clicar(btnProceedToCheckout);
    }

    public static void clicarBtnRemoverMenTshirt(){
        esperarElementoSerClicavel("#product-2 > td.cart_delete > a");
        clicar(btnRemoverMenTshirt);
    }
}
