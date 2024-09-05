package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nomor hari
        System.out.println("Masukkan nomor hari (1-7):");
        int nomorHari = input.nextInt();

        String namaHari = "";

        // Menggunakan switch untuk menentukan nama hari berdasarkan nomor
        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                System.out.println("Masukkan nomor antara 1-7.");
                System.exit(0); // Keluar dari program jika input tidak valid
        }

        // Menampilkan nama hari yang dipilih
        System.out.println("Hari: " + namaHari);
    }
}
