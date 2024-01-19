package mateusaniceto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserCreated {
    private String name;
    private String job;
    private String id;
    private String createdAt;
}
