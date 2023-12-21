package model;

public class Admin {
    private String idAdmin;
    private String username;
    private String password;

    public Admin setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
        return this;
    }

    public String getIdAdmin() {
        return this.idAdmin;
    }

    public Admin setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }
}