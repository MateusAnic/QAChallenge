package mateusaniceto.factory.data;

import mateusaniceto.dto.LogInDto;
import mateusaniceto.util.DataFakerGenerator;

public class LoginData {

    DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();

    public LogInDto loginDadosValidos(){
        LogInDto logInDto = new LogInDto();
        logInDto.setEmail("mateusaniceto@gmail.com");
        logInDto.setPassword("mateus1234");

        return logInDto;
    }

    public LogInDto LoginDadosDinamicos() {
        LogInDto logInDto = new LogInDto();
        logInDto.setEmail(dataFakerGenerator.emailFaker());
        logInDto.setPassword(dataFakerGenerator.passwordFaker());

        return logInDto;
    }
}
