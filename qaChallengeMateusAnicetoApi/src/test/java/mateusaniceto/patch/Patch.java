package mateusaniceto.patch;

import mateusaniceto.client.UserClient;
import mateusaniceto.dataFactory.UserDataFactory;
import mateusaniceto.model.User;
import mateusaniceto.model.UserUpdate;
import org.junit.jupiter.api.Test;
import static org.apache.http.HttpStatus.SC_OK;

public class Patch {

    private UserClient userClient = new UserClient();

    private Integer id = userClient.gerarId();

    @Test
    public void AtualizarUsuarioComSucesso() {
        User user = UserDataFactory.userValido();
        UserUpdate userResult = userClient.atualizarUser(user, id)
                .then()
                .statusCode(SC_OK)
                .extract()
                .as(UserUpdate.class)
                ;
    }

}
