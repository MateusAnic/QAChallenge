package mateusaniceto.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SignInDto {

    private String title;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String Day;
    private String Month;
    private String Year;
    private String adress;
    private String state;
    private String city;
    private String zipCode;
    private String mobileNumber;

}
