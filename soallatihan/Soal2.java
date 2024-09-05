package soallatihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.println("Masukkan angka pertama :");
        int angka1 = scanner.nextInt();

        System.out.println("Masukkan angka kedua :");
        int angka2 = scanner.nextInt();

        System.out.println("Masukkan angka ketiga :");
        int angka3 = scanner.nextInt();

        // Variabel sementara untuk menyimpan urutan angka
        int terbesar, tengah, terkecil;

        // Menentukan angka terbesar, tengah, dan terkecil
        if (angka1 >= angka2 && angka1 >= angka3) {
            terbesar = angka1;
            if (angka2 >= angka3) {
                tengah = angka2;
                terkecil = angka3;
            } else {
                tengah = angka3;
                terkecil = angka2;
            }
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            terbesar = angka2;
            if (angka1 >= angka3) {
                tengah = angka1;
                terkecil = angka3;
            } else {
                tengah = angka3;
                terkecil = angka1;
            }
        } else {
            terbesar = angka3;
            if (angka1 >= angka2) {
                tengah = angka1;
                terkecil = angka2;
            } else {
                tengah = angka2;
                terkecil = angka1;
            }
        }

        // Menampilkan hasil urutan dari terbesar ke terkecil
        System.out.println("Urutan dari terbesar ke terkecil: " + terbesar + ", " + tengah + ", " + terkecil);

        scanner.close();  // Menutup scanner setelah selesai
    }
}