package mateusaniceto.util;

import com.github.javafaker.Faker;

import java.io.File;
import java.util.Random;

public class DataFakerGenerator {

    private static final Faker faker = new Faker();

    Random random = new Random();

    String filePath = "C:\\Users\\mateu\\OneDrive\\Documents\\qaChallengeMateusAniceto\\qaChallengeMateusAniceto\\src\\main\\java\\mateusaniceto\\factory\\data\\images\\gatinho.jpg";

    private static final String title[] = {"Mr", "Mrs"};

    public String emailFaker() {
        return faker.internet().emailAddress();
    }

    public String emailInvalidFaker() {
        return faker.internet().emailAddress().replace("@", "%");
    }

    public String passwordFaker() {
        return faker.internet().password();
    }

    public String firsNameFaker() { return faker.name().firstName(); }

    public String lastNameFaker() { return faker.name().lastName(); }

    public String cardNumberFaker() {
        final String creditCard = faker.finance().creditCard();
        final String creditCardStripped = creditCard.replaceAll("-", "");
        return creditCardStripped;
    }
    public Integer cardCVCFaker() {
        return faker.number().numberBetween(100, 1000);
    }
    public Integer dayFaker() { return faker.number().numberBetween(1, 30); }

    public Integer monthFaker() { return faker.number().numberBetween(1, 12); }

    public Integer yearFaker() { return faker.number().numberBetween(1960, 2005); }

    public String adressFaker() { return faker.address().streetAddress(); }
    public String stateFaker() { return faker.address().state(); }
    public String cityFaker() { return faker.address().city(); }
    public String zipCodeFaker() { return faker.address().zipCode(); }
    public String mobileNumberFaker() { return faker.phoneNumber().phoneNumber(); }

    public String loremFaker12() {
        return faker.lorem().paragraph(12);
    }

    public String loremFaker6() {
        return faker.lorem().paragraph(6);
    }

    public String loremFaker3() {
        return faker.lorem().paragraph(3);
    }

    public String loremFaker1() {
        return faker.lorem().paragraph(1);
    }

    public String imagem() {
        return new File(filePath).getAbsolutePath();
    }

    public String titleFaker() {
        return title[random.nextInt(title.length)];
    }
}
