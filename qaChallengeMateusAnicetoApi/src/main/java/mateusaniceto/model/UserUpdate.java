package mateusaniceto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserUpdate {
    private String name;
    private String job;
    private String updatedAt;
}