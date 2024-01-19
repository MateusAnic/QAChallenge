package mateusaniceto.test;

import mateusaniceto.dto.LogInDto;
import mateusaniceto.dto.PaymentDto;
import mateusaniceto.factory.data.LoginData;
import mateusaniceto.factory.data.PaymentData;
import mateusaniceto.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mateusaniceto.page.BasePage.pegarUrl;

public class TesteRealizarCompraCadastrado extends BaseTest {
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    PaymentPage paymentPage = new PaymentPage();
    LogInAndSignUpPage logInAndSignUpPage = new LogInAndSignUpPage();
    LoginData loginData = new LoginData();
    LogInDto logIn = loginData.loginDadosValidos();
    PaymentData paymentData = new PaymentData();
    PaymentDto payment = paymentData.cartaComDadosValidos();

    @Test
    public void realizarCompraCadastradoComSucesso() {
        homePage.clicarBtnLogin();
        logInAndSignUpPage.preencherEmailLogin(logIn.getEmail());
        logInAndSignUpPage.preencherPasswordLogin(logIn.getPassword());
        logInAndSignUpPage.clicarBtnEntrarLogin();
        homePage.adicionarStylishDress(3);
        homePage.adicionarBeautifulPeacock(2);
        homePage.adicionarMenTshirt(1);
        homePage.clicarBtnCart();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/view_cart");
        cartPage.clicarBtnCheckout();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/checkout");
        checkoutPage.clicarBtnPlaceOrder();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/payment");
        paymentPage.preencherDadosCartao(payment);
        paymentPage.clicarBtnConfirmarPagamento();

    }

}
