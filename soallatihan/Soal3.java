package soallatihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // Meminta pengguna untuk memilih operator
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double hasil = 0;

        // Menghitung berdasarkan operator yang dipilih
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                    return; // Keluar dari program jika ada pembagian dengan 0
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        // Menampilkan hasil perhitungan
        System.out.println("Hasil: " + hasil);
    }
}
