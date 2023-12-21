import java.util.Scanner;

import controller.PesananController;

public class App {

    public static void main(String[] args) {
        PesananController controller = new PesananController();
        controller.setUp();

        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        do {
            tampilkanMenuAwal();
            System.out.print("  Pilih menu (1-4) : ");
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "1":
                    controller.registrasiPengguna();
                    break;
                case "2":
                    controller.inputPengguna();
                    break;
                case "3":
                    controller.inputAdmin();
                    break;
                case "4":
                    lanjut = false;
                    break;
                default:
            }
        } while (lanjut);

        System.out.println();
        System.out.println("Terima Kasih Sudah Berkunjung!");
        System.out.println("Sampai Jumpa di lain Kesempatan!");

    }

    public static void tampilkanMenuAwal() {
        System.out.println();
        System.out.println("|============================================|");
        System.out.println("|                   M E N U                  |");
        System.out.println("|============================================|");
        System.out.println("| Silahkan masuk sebagai Pengguna atau Admin |");
        System.out.println("| 1. Daftar Akun Pengguna                    |");
        System.out.println("| 2. Masuk Sebagai Pengguna                  |");
        System.out.println("| 3. Admin                                   |");
        System.out.println("| 4. Keluar                                  |");
        System.out.println("|============================================|");
    }
}