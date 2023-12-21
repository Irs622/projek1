package model;

public class Film {

    private String idFilm;
    private String judul;
    private String genre;
    private int durasi;
    private String sutradara;
    private String ratingUsia;
    private int studio;

    public Film setIdFilm(String idFilm) {
        this.idFilm = idFilm;
        return this;
    }

    public String getIdFilm() {
        return this.idFilm;
    }

    public Film setJudul(String judul) {
        this.judul = judul;
        return this;
    }

    public String getJudul() {
        return this.judul;
    }

    public Film setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getGenre() {
        return this.genre;
    }

    public Film setDurasi(int durasi) {
        this.durasi = durasi;
        return this;
    }

    public int getDurasi() {
        return this.durasi;
    }

    public Film setSutradara(String sutradara) {
        this.sutradara = sutradara;
        return this;
    }

    public String getSutradara() {
        return this.sutradara;
    }

    public Film setRatingUsia(String ratingUsia) {
        this.ratingUsia = ratingUsia;
        return this;
    }

    public String getRatingUsia() {
        return this.ratingUsia;
    }

    public Film setStudio(int studio) {
        this.studio = studio;
        return this;
    }

    public int getStudio() {
        return this.studio;
    }

}