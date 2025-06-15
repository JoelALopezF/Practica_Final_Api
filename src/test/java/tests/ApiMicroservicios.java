package tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.UserService;



public class ApiMicroservicios {
    @Test
    public void testGetUsers(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo GET\n\n");
        Response getResponse = userApi.GetUser(1);

        String email = getResponse.jsonPath().getString("data.email");
        System.out.println("email valido: " + email);
        Assert.assertTrue(email.contains("@"), "El email no contiene el caracter '@'\n\n");
    }
    @Test
    public void testPostUsers(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo POST\n\n");
        Response getResponse = userApi.PostUsers();
        System.out.println("\n\n");
    }
    @Test
    public void testPutUser(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo PUT\n\n");
        Response getResponse = userApi.PutUsers(2);
        System.out.println("\n\n");
    }
    @Test
    public void testDeleteUser(){
        UserService userApi = new UserService();
        System.out.println("\n\nMetodo DELETE\n\n");
        Response getResponse = userApi.DeleteUsers(2);
        System.out.println("\n\n");
    }
}
