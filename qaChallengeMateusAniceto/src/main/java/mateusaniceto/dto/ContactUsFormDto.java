package mateusaniceto.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.awt.*;

@Data
@JsonIgnoreProperties
public class ContactUsFormDto {
    private String name;
    private String email;
    private String subject;
    private String message;
    private String image;
}
