package mateusaniceto.page;

import org.openqa.selenium.By;

public class LogInAndSignUpPage extends BasePage{
    // MAPEAMENTO

    private static final By inputEmailLogin =
            By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=email]:nth-child(2)");
    private static final By inputPasswordLogin =
            By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > input[type=password]:nth-child(3)");
    private static final By inputNameSignUp =
            By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    private static By inputEmailSignUp =
            By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private static final By btnEntrarLogin =
            By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button");

    private static final By btnSignUp =
            By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");

    // AÇÕES

    public static void preencherEmailLogin(String email){
        preencherInput(inputEmailLogin, email);
    }

    public static void preencherPasswordLogin(String password){
        preencherInput(inputPasswordLogin, password);
    }

    public static void preencherNameSignUp(String name) { preencherInput(inputNameSignUp, name); }

    public static void preencherEmailSignUp(String name) { preencherInput(inputEmailSignUp, name); }
    public static void clicarBtnEntrarLogin() {
        clicar(btnEntrarLogin);
    }

    public static void clicarBtnSignUp(){
        clicar(btnSignUp);
    }

}
