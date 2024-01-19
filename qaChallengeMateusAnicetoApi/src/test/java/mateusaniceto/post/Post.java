package mateusaniceto.post;

import mateusaniceto.client.UserClient;
import mateusaniceto.dataFactory.UserDataFactory;
import mateusaniceto.model.User;
import mateusaniceto.model.UserCreated;
import org.junit.jupiter.api.Test;
import static org.apache.http.HttpStatus.SC_CREATED;

public class Post {

    private UserClient userClient = new UserClient();

    @Test
    public void cadastrarNovoUsuarioComSucesso() {
        User user = UserDataFactory.userValido();
        UserCreated userResult = userClient.cadastrarUser(user)
                .then()
                    .statusCode(SC_CREATED)
                    .extract()
                    .as(UserCreated.class)
                ;

    }
}
