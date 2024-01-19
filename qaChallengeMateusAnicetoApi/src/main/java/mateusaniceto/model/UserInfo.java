package mateusaniceto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserInfo {
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
}
