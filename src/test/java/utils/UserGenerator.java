package utils;
import com.github.javafaker.Faker;

public class UserGenerator {
    public String fakeName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public String fakeRol() {
        Faker faker = new Faker();
        return faker.company().profession();
    }
}

