package config;

public class ConfigManager {

    private String base_uri = "";
    private String header_x_api_key = "";
    private String header_x_api_key_value = "";
    private String header_Content_Type = "";
    private String header_Content_Type_application_json = "";
    private String guest_path_variable = "";

    public ConfigManager() {
        this.base_uri = "https://reqres.in";
        this.header_x_api_key = "x-api-key";
        this.header_x_api_key_value = "reqres-free-v1";
        this.header_Content_Type = "Content-Type";
        this.header_Content_Type_application_json = "application/json";
        this.guest_path_variable = "/api/users/";
    }

    public String getBase_uri() {
        return base_uri;
    }

    public void setBase_uri(String base_uri) {
        this.base_uri = base_uri;
    }

    public String getHeader_x_api_key() {
        return header_x_api_key;
    }

    public void setHeader_x_api_key(String header_x_api_key) {
        this.header_x_api_key = header_x_api_key;
    }

    public String getHeader_x_api_key_value() {
        return header_x_api_key_value;
    }

    public void setHeader_x_api_key_value(String header_x_api_key_value) {
        this.header_x_api_key_value = header_x_api_key_value;
    }

    public String getHeader_Content_Type() {
        return header_Content_Type;
    }

    public void setHeader_Content_Type(String header_Content_Type) {
        this.header_Content_Type = header_Content_Type;
    }

    public String getHeader_Content_Type_application_json() {
        return header_Content_Type_application_json;
    }

    public void setHeader_Content_Type_application_json(String header_Content_Type_application_json) {
        this.header_Content_Type_application_json = header_Content_Type_application_json;
    }

    public String getGuest_path_variable() {
        return guest_path_variable;
    }

    public void setGuest_path_variable(String guest_path_variable) {
        this.guest_path_variable = guest_path_variable;
    }
}
