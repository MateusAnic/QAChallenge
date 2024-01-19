package mateusaniceto.page;


import mateusaniceto.dto.SignInDto;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
public class CreateAccountPage extends BasePage {
    private final static By checkboxMr =
            By.cssSelector("#id_gender1");
    private final static By checkboxMrs =
            By.cssSelector("#id_gender2");
    private final static By inputPassword =
            By.cssSelector("#password");
    private final static By checkboxNewsletter =
            By.cssSelector("#newsletter");
    private final static By btnRegister =
            By.cssSelector("#submitAccount");
    private final static By inputFirstName =
            By.cssSelector("#first_name");
    private final static By inputLastName =
            By.cssSelector("#last_name");
    private final static By inputAddress =
            By.cssSelector("#address1");
    private final static By inputState =
            By.cssSelector("#state");
    private final static By inputCity =
            By.cssSelector("#city");
    private final static By inputZipCode =
            By.cssSelector("#zipcode");
    private final static By inputMobileNumber =
            By.cssSelector("#mobile_number");
    private final static By btnCreateAccount =
            By.cssSelector("#form > div > div > div > div.login-form > form > button");


    public static void preencherDateBirth(SignInDto sign){
        WebElement inputDay =
                driver.findElement(By.cssSelector("#days"));
        WebElement inputMonth =
                driver.findElement(By.cssSelector("#months"));
        WebElement inputYear =
                driver.findElement(By.cssSelector("#years"));
        Select selectDay = new Select(inputDay);
        Select selectMonth = new Select(inputMonth);
        Select selectYear = new Select(inputYear);
        selectDay.selectByValue(String.valueOf(sign.getDay()));
        selectMonth.selectByValue(String.valueOf(sign.getMonth()));
        selectYear.selectByValue(String.valueOf(sign.getYear()));
    }

    public static void preencherTitle(@NotNull String title){
        if(title.equals("Mr")){
            clicar(checkboxMr);
        } else if(title.equals("Mrs")){
            clicar(checkboxMrs);
        }
    }
    public static void preencherPais(){
        WebElement inputCountry =
                driver.findElement(By.cssSelector("#country"));
        Select selectCountry = new Select(inputCountry);
        String optionsCountry[] = {"India", "United States", "Canada", "Australia", "Israel", "New Zealand", "Singapore"};
        Integer random = new Random().nextInt(optionsCountry.length);
        selectCountry.selectByValue(optionsCountry[random]);
    }

    public static void preencherDadosBasicos(@NotNull SignInDto sign){
        preencherTitle(sign.getTitle());
        preencherInput(inputPassword, sign.getPassword());
        preencherDateBirth(sign);
        preencherInput(inputFirstName, sign.getFirstName());
        preencherInput(inputLastName, sign.getLastName());
        preencherInput(inputAddress, sign.getAdress());
        preencherPais();
        preencherInput(inputState, sign.getState());
        preencherInput(inputCity, sign.getCity());
        preencherInput(inputZipCode, sign.getZipCode());
        preencherInput(inputMobileNumber, sign.getMobileNumber());
    }

    public static void clicarBtnCreateAccount(){
        clicar(btnCreateAccount);
    }

}
