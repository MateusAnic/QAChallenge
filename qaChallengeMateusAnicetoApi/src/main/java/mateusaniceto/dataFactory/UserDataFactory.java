package mateusaniceto.dataFactory;


import mateusaniceto.model.User;
import net.datafaker.Faker;
import java.util.Locale;
public class UserDataFactory {
    private static Faker faker = new Faker(new Locale("PT-BR"));

    public static User novoUser(){
        User novoUser = new User();
        novoUser.setName(faker.name().firstName());
        novoUser.setJob(faker.job().title());

        return novoUser;
    }

    public static User userValido(){
        return novoUser();
    }

}
