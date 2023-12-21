package model;

public class Akun {

    private String username;
    private String email;
    private String noHp;
    private String password;

    public Akun setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public Akun setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public Akun setNoHp(String noHp) {
        this.noHp = noHp;
        return this;
    }

    public String getNoHp() {
        return this.noHp;
    }

    public Akun setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return this.password;
    }
}