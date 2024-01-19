package mateusaniceto.factory.data;

import mateusaniceto.dto.ContactUsFormDto;
import mateusaniceto.util.DataFakerGenerator;

public class ContactUsFormData {

    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public ContactUsFormDto gerarDadosContactUs() {
        ContactUsFormDto contactUsForm = new ContactUsFormDto();
        contactUsForm.setName(dataFakerGenerator.firsNameFaker());
        contactUsForm.setEmail(dataFakerGenerator.emailFaker());
        contactUsForm.setSubject(dataFakerGenerator.loremFaker6());
        contactUsForm.setMessage(dataFakerGenerator.loremFaker12());
        contactUsForm.setImage(dataFakerGenerator.imagem());

        return contactUsForm;
    }
}
