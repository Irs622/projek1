package model;

public class Pengguna extends Akun {
    private String idPengguna;

    public Pengguna setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
        return this;
    }

    public String getIdPengguna() {
        return this.idPengguna;
    }
}