package mateusaniceto.get;

import mateusaniceto.client.UserClient;
import mateusaniceto.model.ListaUser;
import org.junit.jupiter.api.Test;
import static org.apache.http.HttpStatus.SC_OK;

public class GetListUser {
    private UserClient userClient = new UserClient();

    @Test
    public void listarVariosUsuariosPorPaginaComSucesso(){
        ListaUser listarResult = userClient.listarUsersComPagina(2)
            .then()
                .statusCode(SC_OK)
                .extract()
                .as(ListaUser.class)
                ;
    }

    @Test
    public void listarVariosUsuariosSemPaginaComSucesso(){
        ListaUser listarResult = userClient.listarUsersSemPagina()
                .then()
                .statusCode(SC_OK)
                .extract()
                .as(ListaUser.class)
                ;
    }


}
