package mateusaniceto.test;

import mateusaniceto.dto.LogInDto;
import mateusaniceto.factory.data.LoginData;
import mateusaniceto.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mateusaniceto.factory.seleniumFactory.Elements.esperarElementoSerClicavel;
import static mateusaniceto.page.BasePage.pegarUrl;

public class TesteRemoverItemDoCarrinho extends BaseTest{

    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    LogInAndSignUpPage logInAndSignUpPage = new LogInAndSignUpPage();
    LoginData loginData = new LoginData();
    LogInDto logIn = loginData.loginDadosValidos();

    @Test
    public void removerItemDoCarrinho(){
        homePage.clicarBtnLogin();
        logInAndSignUpPage.preencherEmailLogin(logIn.getEmail());
        logInAndSignUpPage.preencherPasswordLogin(logIn.getPassword());
        logInAndSignUpPage.clicarBtnEntrarLogin();
        homePage.adicionarMenTshirt(2);
        homePage.clicarBtnCart();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/view_cart");
        cartPage.clicarBtnRemoverMenTshirt();
    }
}
