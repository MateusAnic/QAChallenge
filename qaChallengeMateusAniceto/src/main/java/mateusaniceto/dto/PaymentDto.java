package mateusaniceto.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDto {
    private String name;
    private String number;
    private int cvc;
    private int month;
    private int year;
}
