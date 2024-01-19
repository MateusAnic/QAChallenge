package mateusaniceto.test;

import mateusaniceto.dto.SignInDto;
import mateusaniceto.factory.data.SignInData;
import mateusaniceto.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mateusaniceto.page.BasePage.pegarUrl;

public class TesteNovoCadastro extends BaseTest {
    HomePage homePage = new HomePage();
    SignInData signInData = new SignInData();
    SignInDto sign = signInData.signInComDadosDinamicos();
    LogInAndSignUpPage logInAndSignUpPage = new LogInAndSignUpPage();

    CreateAccountPage createAccountPage = new CreateAccountPage();

    @Test
    public void realizarNovoCadastro(){
        homePage.clicarBtnLogin();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/login");
        logInAndSignUpPage.preencherNameSignUp(sign.getFirstName());
        logInAndSignUpPage.preencherEmailSignUp(sign.getEmail());
        logInAndSignUpPage.clicarBtnSignUp();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/signup");
        createAccountPage.preencherDadosBasicos(sign);
        createAccountPage.clicarBtnCreateAccount();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/account_created");



    }
}
