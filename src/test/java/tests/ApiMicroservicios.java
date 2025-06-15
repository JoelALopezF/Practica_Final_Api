package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import services.UserService;



public class ApiMicroservicios {
    @Test
    public void testGetUsers(){
        UserService userApi = new UserService();
        Response getResponse = userApi.GetUser(1);

        String email = getResponse.jsonPath().getString("data.email");
        System.out.println("email valido: " + email);
        assertTrue(email.contains("@"), "El email no contiene el caracter '@'");
    }
    @Test
    public void testPostUsers(){
        UserService userApi = new UserService();
        Response getResponse = userApi.PostUsers();
    }
    @Test
    public void testPutUser(){
        UserService userApi = new UserService();
        Response getResponse = userApi.PutUsers(2);
    }
    @Test
    public void testDeleteUser(){
        UserService userApi = new UserService();
        Response getResponse = userApi.DeleteUsers(2);
    }
}
