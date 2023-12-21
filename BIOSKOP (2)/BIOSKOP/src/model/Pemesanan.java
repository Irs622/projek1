package model;

import java.time.LocalDate;

public class Pemesanan {
    private Pengguna pengguna;
    private String kodePemesanan;
    private Film film;
    private int jumlahTiket;
    private int hargaPesanan;
    private LocalDate tanggal;

    public Pemesanan setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
        return this;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public Pemesanan setKodePemesanan(String kodePemesanan) {
        this.kodePemesanan = kodePemesanan;
        return this;
    }

    public String getKodePemesanan() {
        return this.kodePemesanan;
    }

    public Pemesanan setFilm(Film film) {
        this.film = film;
        return this;
    }

    public Film getFilm() {
        return film;
    }

    public Pemesanan setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
        return this;
    }

    public int getJumlahTiket() {
        return this.jumlahTiket;
    }

    public Pemesanan setHargaPesanan(int hargaPesanan) {
        this.hargaPesanan = hargaPesanan;
        return this;
    }

    public int getHargaPesanan() {
        return this.hargaPesanan;
    }

    public Pemesanan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public LocalDate getTanggal() {
        return this.tanggal;
    }

}