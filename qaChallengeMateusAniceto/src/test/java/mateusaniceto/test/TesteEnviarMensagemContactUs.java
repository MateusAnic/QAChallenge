package mateusaniceto.test;

import mateusaniceto.dto.ContactUsFormDto;
import mateusaniceto.dto.LogInDto;
import mateusaniceto.factory.data.ContactUsFormData;
import mateusaniceto.factory.data.LoginData;
import mateusaniceto.page.ContactUsPage;
import mateusaniceto.page.HomePage;
import mateusaniceto.page.LogInAndSignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mateusaniceto.factory.seleniumFactory.SeleniumFactory.driver;
import static mateusaniceto.page.BasePage.pegarUrl;

public class TesteEnviarMensagemContactUs extends BaseTest{

    HomePage homePage = new HomePage();
    LogInAndSignUpPage logInAndSignUpPage = new LogInAndSignUpPage();
    ContactUsFormData contactUsFormData = new ContactUsFormData();
    ContactUsFormDto contactUsForm = contactUsFormData.gerarDadosContactUs();
    ContactUsPage contactUsPage = new ContactUsPage();
    LoginData loginData = new LoginData();
    LogInDto logIn = loginData.loginDadosValidos();

    @Test
    public void enviarMensagemComSucesso(){
        homePage.clicarBtnLogin();
        logInAndSignUpPage.preencherEmailLogin(logIn.getEmail());
        logInAndSignUpPage.preencherPasswordLogin(logIn.getPassword());
        logInAndSignUpPage.clicarBtnEntrarLogin();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/");
        homePage.clicarBtnContactUs();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/contact_us");
        contactUsPage.preencherDadosContactUs(contactUsForm);
        contactUsPage.clicarBtnSubmit();
        driver.switchTo().alert().accept();
        contactUsPage.validarFormEnviadoComSucesso();
    }

}
