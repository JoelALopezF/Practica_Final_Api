package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;



public class ApiMicroservicios {

    int idGuestCreado;

    //Test que valida metodo GET
    @Test
    public void testGetUsers(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo GET\n\n");
        Response getResponse = userApi.GetUser(1);

        String email = getResponse.jsonPath().getString("data.email");
        System.out.println("email valido: " + email);
        Assert.assertTrue(email.contains("@"), "El email no contiene el caracter '@'\n\n");
    }
    //Test que valida metodo Post
    @Test
    public void testPostUsers(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo POST\n\n");
        Response getResponse = userApi.PostUsers();
        idGuestCreado  = getResponse.jsonPath().getInt("id");
        System.out.println("\n\n");
    }
    //Test que valida metodo PUT
    @Test
    public void testPutUser(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo PUT\n\n");
        userApi.PutUsers(idGuestCreado);
        System.out.println("\n\n");
    }
    //Test que valida metodo DELETE
    @Test
    public void testDeleteUser(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo DELETE\n\n");
        userApi.DeleteUsers(idGuestCreado);
        System.out.println("\n\n");
    }
}
