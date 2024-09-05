package branching;

import java.util.Scanner;

public class Iftatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Membaca input dari pengguna

        System.out.println("Masukkan nomor hari (1-7):");
        int nomorHari = input.nextInt();

        String namaHari = "";

        // Menggunakan if-else untuk menentukan nama hari
        if (nomorHari == 1) {
            namaHari = "Minggu";
        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukkan nomor antara 1-7");
            System.exit(0);  // Mengakhiri program jika input tidak valid
        }

        System.out.println("Hari: " + namaHari);
    }
}

