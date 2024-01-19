package mateusaniceto.page;

import org.openqa.selenium.By;

public class AccountCreated extends BasePage {

    private final static By btnContinue =
            By.cssSelector("#form > div > div > div > div > a");

    public static void clicarBtnContinue(){
        clicar(btnContinue);
    }
}
