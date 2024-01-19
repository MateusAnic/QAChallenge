package mateusaniceto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListaUser {
    private Integer page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private UserInfo[] data;
    @JsonIgnore
    private Support[] support;
}
