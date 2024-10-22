/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/
package Bab17soal1;
import java.util.Scanner;

/**
 *
 * @author user
 */

public class Bab17Soal1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Meminta jumlah kota yang akan dimasukkan
        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = Scanner.nextInt();
        Scanner.nextLine(); // Membersihkan newline yang tersisa setelah nextInt()

        // Membuat array untuk menyimpan nama kota
        String[] kota = new String[jumlahKota];

        // Memasukkan nama kota ke dalam array
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = Scanner.nextLine();
        }

        // Menampilkan elemen array
        System.out.println("\nKota-kota yang dimasukkan:");
        for (String kota1 : kota) {
            System.out.println(kota1);
        }

        // Menutup scanner
        Scanner.close();
    }
}