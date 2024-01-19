package mateusaniceto.get;

import mateusaniceto.client.UserClient;
import mateusaniceto.model.UserResult;
import org.junit.jupiter.api.Test;
import static org.apache.http.HttpStatus.SC_NOT_FOUND;
import static org.apache.http.HttpStatus.SC_OK;

public class GetSingleUser {
    private UserClient userClient = new UserClient();

    @Test
    public void listarUnicoUsuarioComIdValido(){
        UserResult listarResult = userClient.listarUserComParametroId(2)
                .then()
                .statusCode(SC_OK)
                .extract()
                .as(UserResult.class)
                ;
    }

    @Test
    public void listarUnicoUsuarioComIdInvalido(){
        UserResult listarResult = userClient.listarUserComParametroIdInvalido()
                .then()
                .statusCode(SC_NOT_FOUND)
                .extract()
                .as(UserResult.class)
                ;
    }

    @Test
    public void listarUnicoUsuarioComIdNegativo(){
        UserResult listarResult = userClient.listarUserComParametroIdNegativo()
                .then()
                .statusCode(SC_NOT_FOUND)
                .extract()
                .as(UserResult.class)
                ;
    }
}
