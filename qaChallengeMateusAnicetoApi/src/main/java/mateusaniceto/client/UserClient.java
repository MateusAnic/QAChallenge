package mateusaniceto.client;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import mateusaniceto.model.User;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class UserClient {

    private static String USERS = "/api/users";
    private static String USERSID = "/api/users/";

    public UserClient(){
        BaseClient.initConfig();
    }

    public Response cadastrarUser(User user){
        return
                given()
                        .contentType(ContentType.JSON)
                        .body(user)
                .when()
                        .post(USERS)
                ;
    }

    public Integer gerarId() {
        Random random = new Random();
        int idAleatorio = random.nextInt(999) + 1;
        return idAleatorio;
    }

    public Response atualizarUser(User user, int id){
        return
                given()
                        .contentType(ContentType.JSON)
                        .body(user)
                .when()
                        .patch(USERSID)
                ;
    }

    public Response listarUserComParametroId(int idUser){
        return
                given()
                        .queryParam("id", idUser)
                .when()
                        .get(USERSID)
                ;
    }

    public Response listarUserComParametroIdInvalido(){
        return
                given()
                        .queryParam("id", "arrozEfeijao")
                .when()
                        .get(USERSID)
                ;
    }

    public Response listarUserComParametroIdNegativo(){
        return
                given()
                        .queryParam("id", -2)
                .when()
                        .get(USERSID)
                ;
    }

    public Response listarUsersComPagina(int pagina){
        return
                given()
                        .queryParam("page", pagina)
                .when()
                        .get(USERS)
                ;
    }

    public Response listarUsersSemPagina(){
        return
                given()
                .when()
                        .get(USERS)
                ;
    }
}
