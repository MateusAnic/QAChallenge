package mateusaniceto.page;

import mateusaniceto.dto.PaymentDto;
import org.openqa.selenium.By;

public class PaymentPage extends BasePage{
    private static final By inputNomeCartao =
            By.cssSelector("#payment-form > div:nth-child(2) > div > input");
    private static final By inputNumeroCartao =
            By.cssSelector("#payment-form > div:nth-child(3) > div > input");
    private static final By inputCVCCartao =
            By.cssSelector("#payment-form > div:nth-child(4) > div.col-sm-4.form-group.cvc > input");
    private static final By inputExpirationMesCartao =
            By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(2) > input");
    private static final By inputExpirationAnoCartao =
            By.cssSelector("#payment-form > div:nth-child(4) > div:nth-child(3) > input");
    private static final By btnConfirmOrder =
            By.cssSelector("#submit");

    public static void preencherDadosCartao(PaymentDto payment){
        preencherInput(inputNomeCartao, payment.getName());
        preencherInput(inputNumeroCartao, payment.getNumber());
        preencherInput(inputCVCCartao, String.valueOf(payment.getCvc()));
        preencherInput(inputExpirationMesCartao, String.valueOf(payment.getMonth()));
        preencherInput(inputExpirationAnoCartao, String.valueOf(payment.getYear()));

    }

    public static void clicarBtnConfirmarPagamento(){
        clicar(btnConfirmOrder);
    }

}
