package controller;

import model.Admin;
import model.Film;
import model.Pemesanan;
import model.Pengguna;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PesananController {
    private HashMap<String, Film> films = new HashMap();
    private HashMap<String, Pengguna> daftarPengguna = new HashMap();
    private ArrayList<Pemesanan> riwayatPemesanan = new ArrayList<>();
    private int noIdPengguna = 0;
    private int noPemesanan = 0;

    public void setUp() {
        Film film1 = new Film();
        Film film2 = new Film();
        Film film3 = new Film();
        Film film4 = new Film();
        Film film5 = new Film();

        film1
                .setIdFilm("01")
                .setJudul("Aquaman And The Lost Kingdom")
                .setGenre("Action, Adventure, Fantasy")
                .setDurasi(124)
                .setSutradara("James Wan")
                .setRatingUsia("13+")
                .setStudio(1);
        film2
                .setIdFilm("02")
                .setJudul("Layangan Putus The Movie")
                .setGenre("Drama")
                .setDurasi(91)
                .setSutradara("Benni Setiawan")
                .setRatingUsia("13+")
                .setStudio(2);
        film3
                .setIdFilm("03")
                .setJudul("Siksa Neraka")
                .setGenre("Horror, Thriller")
                .setDurasi(98)
                .setSutradara("Anggy Umbara")
                .setRatingUsia("17+")
                .setStudio(3);
        film4
                .setIdFilm("04")
                .setJudul("Jatuh Cinta Seperti Di Film-film")
                .setGenre("Comedy, Romance")
                .setDurasi(118)
                .setSutradara("Yandy Laurens")
                .setRatingUsia("13+")
                .setStudio(4);
        film5
                .setIdFilm("05")
                .setJudul("172 Days")
                .setGenre("Drama")
                .setDurasi(103)
                .setSutradara("Hadrah Daeng Ratu")
                .setRatingUsia("13+")
                .setStudio(5);

        films.put(film1.getIdFilm(), film1);
        films.put(film2.getIdFilm(), film2);
        films.put(film3.getIdFilm(), film3);
        films.put(film4.getIdFilm(), film4);
        films.put(film5.getIdFilm(), film5);
    }

    public void lihatDaftarFilm() {
        System.out.println();

        System.out.println("============ D A F T A R  F I L M ============");
        for (Map.Entry<String, Film> film : films.entrySet()) {
            String key = film.getKey();
            Film tFilm = film.getValue();

            System.out.println("  Kode Film \t : " + key);
            System.out.println("  Judul Film \t : " + tFilm.getJudul());
            System.out.println("  Genre \t : " + tFilm.getGenre());
            System.out.println("  Durasi \t : " + tFilm.getDurasi() + " Menit");
            System.out.println("  Sutradara \t : " + tFilm.getSutradara());
            System.out.println("  Rating Usia \t : " + tFilm.getRatingUsia());
            System.out.println("  Studio \t : " + tFilm.getStudio());
            System.out.println();
        }
    }

    public void registrasiPengguna() {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("|============================================|");
        System.out.println("|      SILAHKAN DAFTAR SEBAGAI PENGGUNA      |");
        System.out.println("|============================================|");
        System.out.println("  Silahkan Masukkan Informasi Anda");

        System.out.print("  Masukkan Nama\t    : ");
        String username = input.nextLine();

        System.out.print("  Masukkan Email    : ");
        String email = input.nextLine();

        System.out.print("  Masukkan No. HP   : ");
        String noHp = input.nextLine();

        System.out.print("  Masukkan Password : ");
        String password = input.nextLine();

        noIdPengguna++;
        String idPengguna = "U" + noIdPengguna;

        System.out.println();
        System.out.println("  Selamat! Anda Berhasil Membuat Akun Pengguna!");

        Pengguna penggunaBaru = new Pengguna();
        penggunaBaru
                .setIdPengguna(idPengguna)
                .setUsername(username)
                .setEmail(email)
                .setNoHp(noHp)
                .setPassword(password);

        daftarPengguna.put(penggunaBaru.getIdPengguna(), penggunaBaru);
    }

    public void inputPengguna() {
        Scanner input = new Scanner(System.in);
        System.out.println();

        boolean ulangi = true;
        do {
            System.out.println("|============================================|");
            System.out.println("|           MASUK SEBAGAI PENGGUNA           |");
            System.out.println("|============================================|");
            System.out.println("  Silahkan Masukkan Informasi Anda");
            System.out.print("  Masukkan Email    : ");
            String email = input.nextLine();

            System.out.print("  Masukkan Password : ");
            String password = input.nextLine();

            boolean penggunaAda = false;

            for (int i = 1; i <= daftarPengguna.size(); i++) {
                if (daftarPengguna.get(String.valueOf("U" + i)).getEmail().equals(email)
                        && daftarPengguna.get(String.valueOf("U" + i)).getPassword().equals(password)) {

                    penggunaAda = true;
                    String idPengguna = String.valueOf("U" + i);
                    Pengguna tPengguna = daftarPengguna.get(idPengguna);

                    boolean lanjut = true;
                    do {
                        System.out.println();
                        System.out.println("|============================================|");
                        System.out.println("|          M E N U  P E N G G U N A          |");
                        System.out.println("|============================================|");
                        System.out.println("| 1. Tampilkan Daftar Film                   |");
                        System.out.println("| 2. Pesan Tiket                             |");
                        System.out.println("| 3. Lihat Riwayat Pemesanan                 |");
                        System.out.println("| 4. Exit                                    |");
                        System.out.println("|============================================|");
                        System.out.print("  Pilih menu (1-4): ");
                        String pilihanPengguna = input.nextLine();
                        switch (pilihanPengguna) {
                            case "1":
                                lihatDaftarFilm();
                                break;
                            case "2":
                                pesanTiket(tPengguna);
                                break;
                            case "3":
                                String nama = tPengguna.getUsername();
                                lihatRiwayatPemesanan(nama);
                                break;
                            case "4":
                                lanjut = false;
                                ulangi = false;
                                break;
                            default:
                                break;
                        }
                    } while (lanjut);
                }
            }
            if (!penggunaAda) {
                System.out.println();
                System.out.println("  Email dan Password Salah, Silahkan Coba Lagi!");
                System.out.print("  Apakah Anda Ingin Mencoba lagi (Y/N): ");
                String cobaLagi = input.nextLine();

                System.out.println();
                if (cobaLagi.equalsIgnoreCase("Y")) {
                    ulangi = true;
                } else {
                    ulangi = false;
                }
            }
        } while (ulangi);
    }

    public void pesanTiket(Pengguna user) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("|============================================|");
        System.out.println("|                 PESAN TIKET                |");
        System.out.println("|============================================|");
        System.out.print("  Silahkan Masukkan Kode Film   : ");
        String kodeFilm = input.nextLine();

        boolean filmAda = false;
        for (int i = 1; i < films.size(); i++) {
            if (films.get(String.valueOf("0" + i)).getIdFilm().equals(kodeFilm)) {

                System.out.print("  Jumlah Tiket yang Ingin Dibeli: ");
                int jumlah = input.nextInt();
                input.nextLine();

                String kodeFilmBaru = String.valueOf("0" + i);
                filmAda = true;

                System.out.println();
                System.out.print("  Apakah Anda Yakin Ingin Memesan Ini? (Y/N): ");
                String konfirmasiPesanan = input.nextLine();

                if (konfirmasiPesanan.equalsIgnoreCase("Y")) {
                    Film filmDipilih = films.get(kodeFilmBaru);
                    Pemesanan pemesanan = new Pemesanan();
                    noPemesanan++;
                    String kodePemesanan = "P" + noPemesanan;
                    int hargaPesanan = jumlah * 25000;

                    pemesanan
                            .setPengguna(user)
                            .setKodePemesanan(kodePemesanan)
                            .setFilm(filmDipilih)
                            .setJumlahTiket(jumlah)
                            .setHargaPesanan(hargaPesanan)
                            .setTanggal(LocalDate.now());

                    riwayatPemesanan.add(pemesanan);
                    System.out.println();
                    System.out.println("============= PEMESANAN BERHASIL =============");
                    System.out.println("  Kode Pesanan\t : " + pemesanan.getKodePemesanan());
                    System.out.println("  Nama\t\t : " + user.getUsername());
                    System.out.println("  Film\t\t : " + pemesanan.getFilm().getJudul());
                    System.out.println("  Jumlah Tiket\t : " + pemesanan.getJumlahTiket());
                    System.out.println("  Harga\t\t : Rp " + pemesanan.getHargaPesanan());
                    System.out.println("==============================================");
                }
            }
        }
        if (!filmAda) {
            System.out.println();
            System.out.println("  Film Tidak Tersedia.");
        }
    }

    public void lihatRiwayatPemesanan(String user) {
        System.out.println();

        System.out.println("|===========================================|");
        System.out.println("|             RIWAYAT PESANAN ANDA          |");
        System.out.println("|===========================================|");
        if (!riwayatPemesanan.isEmpty()) {
            for (Pemesanan pemesanan : riwayatPemesanan) {
                if (pemesanan.getPengguna().getUsername().equals(user)) {
                    System.out.println("  Kode Pesanan\t : " + pemesanan.getKodePemesanan());
                    System.out.println("  Tanggal Pesanan: " + pemesanan.getTanggal());
                    System.out.println("  Film\t\t : " + pemesanan.getFilm().getJudul());
                    System.out.println("  Jumlah Tiket\t : " + pemesanan.getJumlahTiket());
                    System.out.println("  Harga\t\t : Rp " + pemesanan.getHargaPesanan());
                    System.out.println("|===========================================|");
                }
            }
        } else {
            System.out.println("  Belum ada riwayat pemesanan");
        }
    }

    public void inputAdmin() {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        admin
                .setIdAdmin("1223")
                .setUsername("Admin")
                .setPassword("12345");

        System.out.println();

        System.out.println("|============================================|");
        System.out.println("|              MASUK SEBAGAI ADMIN           |");
        System.out.println("|============================================|");
        System.out.println("  Silahkan Masukkan Informasi Anda");

        int ulangi = 0;
        do {
            System.out.print("  Masukkan Username : ");
            String username = input.next();

            System.out.print("  Masukkan Password : ");
            String password = input.next();
            input.nextLine();

            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                boolean lanjut = true;
                String pilihanAdmin;
                do {
                    System.out.println();
                    System.out.println("|============================================|");
                    System.out.println("|              M E N U  A D M I N            |");
                    System.out.println("|============================================|");
                    System.out.println("| 1. Lihat Daftar Pengguna                   |");
                    System.out.println("| 2. Hapus Akun Pengguna                     |");
                    System.out.println("| 3. Lihat Riwayat Pemesanan                 |");
                    System.out.println("| 4. Lihat Pendapatan                        |");
                    System.out.println("| 5. Exit                                    |");
                    System.out.println("|============================================|");
                    System.out.print("  Pilih menu (1-4): ");
                    pilihanAdmin = input.nextLine();
                    switch (pilihanAdmin) {
                        case "1":
                            lihatDaftarPengguna();
                            break;
                        case "2":
                            hapusDaftarPengguna();
                            break;
                        case "3":
                            lihatRiwayatSemuaPemesanan();
                            break;
                        case "4":
                            lihatPendapatan();
                            break;
                        case "5":
                            lanjut = false;
                            break;
                        default:
                            break;
                    }
                } while (lanjut);
                return;
            } else {
                System.out.println("  Username dan Password Salah, Silahkan Coba Lagi.");
                System.out.println();
                ulangi++;
            }
        } while (ulangi != 3);
    }

    public void lihatDaftarPengguna() {
        System.out.println();

        System.out.println("|===========================================|");
        System.out.println("|               DAFTAR PENGGUNA             |");
        System.out.println("|===========================================|");

        if (!daftarPengguna.isEmpty()) {
            for (Map.Entry<String, Pengguna> pengguna : daftarPengguna.entrySet()) {
                Pengguna tPengguna = pengguna.getValue();
                System.out.println("  Id Pengguna\t : " + tPengguna.getIdPengguna());
                System.out.println("  Pengguna\t : " + tPengguna.getUsername());
                System.out.println("  Email\t\t : " + tPengguna.getEmail());
                System.out.println("  Password\t : " + tPengguna.getPassword());
                System.out.println("  No. HP\t : " + tPengguna.getNoHp());
                System.out.println();
            }
        } else {
            System.out.println("  Tidak Ada Daftar Pengguna.");
        }
    }

    public void hapusDaftarPengguna() {
        Scanner input = new Scanner(System.in);

        if (!daftarPengguna.isEmpty()) {
            System.out.println();
            System.out.print("  Silahkan Masukkan ID Pengguna yang ingin dihapus: ");
            String idPengguna = input.nextLine();
            Pengguna penggunaYangAkanDihapus = daftarPengguna.get(idPengguna);
            if (penggunaYangAkanDihapus != null) {
                daftarPengguna.remove(idPengguna);
                System.out.println();
                System.out.println("  Pengguna Berhasil Dihapus!");
            } else {
                System.out.println();
                System.out.println("  Pengguna dengan ID " + idPengguna + " Tidak Ditemukan.");
            }
        } else {
            System.out.println();
            System.out.println("  Daftar Pengguna Kosong.");
        }
    }

    public void lihatRiwayatSemuaPemesanan() {
        System.out.println();

        System.out.println("|===========================================|");
        System.out.println("|              RIWAYAT PESANAN              |");
        System.out.println("|===========================================|");

        if (!riwayatPemesanan.isEmpty()) {
            for (Pemesanan pemesanan : riwayatPemesanan) {
                System.out.println("  Id Pengguna\t : " + pemesanan.getPengguna().getIdPengguna());
                System.out.println("  Pengguna\t : " + pemesanan.getPengguna().getUsername());
                System.out.println("  Email\t\t : " + pemesanan.getPengguna().getEmail());
                System.out.println("  No. HP\t : " + pemesanan.getPengguna().getNoHp());
                System.out.println();
                System.out.println("  Tanggal\t : " + pemesanan.getTanggal());
                System.out.println("  Kode Pesanan\t : " + pemesanan.getKodePemesanan());
                System.out.println("  Film\t\t : " + pemesanan.getFilm().getJudul());
                System.out.println("  jumlah Tiket\t : " + pemesanan.getJumlahTiket());
                System.out.println("  Harga\t\t : Rp " + pemesanan.getHargaPesanan());
                System.out.println("|===========================================|");
            }
        } else {
            System.out.println("  Belum ada riwayat pemesanan");
        }
    }

    public void lihatPendapatan() {
        System.out.println();

        System.out.println("|===========================================|");
        System.out.println("|                 PENDAPATAN                |");
        System.out.println("|===========================================|");
        int totalPendapatan = 0;
        for (Pemesanan pemesanan : riwayatPemesanan) {
            totalPendapatan += pemesanan.getHargaPesanan();
        }
        System.out.println("  Total Pendapatan hari ini Rp " + totalPendapatan);
        System.out.println();
    }
}