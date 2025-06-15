package utils;
import com.github.javafaker.Faker;

public class UserGenerator {
    //Generar un nambre fake
    public String fakeName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    //Generar un rol fake
    public String fakeRol() {
        Faker faker = new Faker();
        return faker.company().profession();
    }
}

