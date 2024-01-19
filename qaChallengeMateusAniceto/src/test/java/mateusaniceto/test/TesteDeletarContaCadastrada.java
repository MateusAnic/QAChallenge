package mateusaniceto.test;

import mateusaniceto.dto.SignInDto;
import mateusaniceto.factory.data.SignInData;
import mateusaniceto.page.AccountCreated;
import mateusaniceto.page.CreateAccountPage;
import mateusaniceto.page.HomePage;
import mateusaniceto.page.LogInAndSignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static mateusaniceto.page.BasePage.pegarUrl;

public class TesteDeletarContaCadastrada extends BaseTest{

    HomePage homePage = new HomePage();
    SignInData signInData = new SignInData();
    SignInDto sign = signInData.signInComDadosDinamicos();
    LogInAndSignUpPage logInAndSignUpPage = new LogInAndSignUpPage();
    CreateAccountPage createAccountPage = new CreateAccountPage();
    AccountCreated accountCreated = new AccountCreated();


    @Test
    public void deletarContaComSucesso(){
        homePage.clicarBtnLogin();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/login");
        logInAndSignUpPage.preencherNameSignUp(sign.getFirstName());
        logInAndSignUpPage.preencherEmailSignUp(sign.getEmail());
        logInAndSignUpPage.clicarBtnSignUp();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/signup");
        createAccountPage.preencherDadosBasicos(sign);
        createAccountPage.clicarBtnCreateAccount();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/account_created");
        accountCreated.clicarBtnContinue();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/");
        homePage.clicarBtnDeletarConta();
        Assert.assertEquals(pegarUrl(), "https://automationexercise.com/delete_account");

    }

}
