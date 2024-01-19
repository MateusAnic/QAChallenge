package mateusaniceto.page;

import mateusaniceto.dto.ContactUsFormDto;
import org.openqa.selenium.By;

public class ContactUsPage extends BasePage{

    private static final By inputNameContactUs =
            By.cssSelector("#contact-us-form > div:nth-child(2) > input");
    private static final By inputEmailContactUs =
            By.cssSelector("#contact-us-form > div:nth-child(3) > input");
    private static final By inputSubjectContactUs =
            By.cssSelector("#contact-us-form > div:nth-child(4) > input");
    private static final By inputMessageContactUs =
            By.cssSelector("#message");
    private static final By inputAttachFile =
            By.cssSelector("#contact-us-form > div:nth-child(6) > input");
    private static final By btnSubmit =
            By.cssSelector("#contact-us-form > div:nth-child(7) > input");
    private static final By textoSucessoForm =
            By.cssSelector("#contact-page > div.row > div.col-sm-8 > div > div.status.alert.alert-success");

    public static void preencherInputEmailContactUs(String email) {
        preencherInput(inputEmailContactUs, email);
    }

    public static void preencherInputNameContactUs(String name) {
        preencherInput(inputNameContactUs, name);
    }

    public static void preencherInputSubjectContactUs(String subject) {
        preencherInput(inputSubjectContactUs, subject);
    }
    public static void preencherInputAttachFile(String file) {
        preencherInput(inputAttachFile, file);
    }

    public static void preencherInputMessageContactUs(String message) {
        preencherInput(inputMessageContactUs, message);
    }
    public static void preencherDadosContactUs(ContactUsFormDto contactData){
        preencherInputNameContactUs(contactData.getName());
        preencherInputEmailContactUs(contactData.getEmail());
        preencherInputSubjectContactUs(contactData.getSubject());
        preencherInputMessageContactUs(contactData.getMessage());
        preencherInputAttachFile(contactData.getImage());
    }
    public static void clicarBtnSubmit(){
        esperarElementoSerClicavel("#contact-us-form > div:nth-child(7) > input");
        clicar(btnSubmit);
    }
    public String validarFormEnviadoComSucesso() {
        return lerTexto(textoSucessoForm);
    }
}
