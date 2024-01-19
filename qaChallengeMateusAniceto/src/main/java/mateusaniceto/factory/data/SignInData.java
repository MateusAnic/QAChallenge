package mateusaniceto.factory.data;

import mateusaniceto.dto.SignInDto;
import mateusaniceto.util.DataFakerGenerator;

public class SignInData {

    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();


    public SignInDto signInComDadosDinamicos(){
        SignInDto signInDto = new SignInDto();
        signInDto.setTitle(dataFakerGenerator.titleFaker());
        signInDto.setFirstName(dataFakerGenerator.firsNameFaker());
        signInDto.setLastName(dataFakerGenerator.lastNameFaker());
        signInDto.setEmail(dataFakerGenerator.emailFaker());
        signInDto.setPassword(dataFakerGenerator.passwordFaker());
        signInDto.setDay(dataFakerGenerator.dayFaker().toString());
        signInDto.setMonth(dataFakerGenerator.monthFaker().toString());
        signInDto.setYear(dataFakerGenerator.yearFaker().toString());
        signInDto.setAdress(dataFakerGenerator.adressFaker());
        signInDto.setState(dataFakerGenerator.stateFaker());
        signInDto.setCity(dataFakerGenerator.cityFaker());
        signInDto.setZipCode(dataFakerGenerator.zipCodeFaker());
        signInDto.setMobileNumber(dataFakerGenerator.mobileNumberFaker());

        return signInDto;
    }
}
