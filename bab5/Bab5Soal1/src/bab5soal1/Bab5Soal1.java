/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5soal1;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab5Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // input data karyawan
        System.out.print("Masukkan Nama Karyawan: ");
        String Nama_Karyawan = scanner.nextLine();
        
        System.out.print("Masukkan Alamat: ");
        String Alamat = scanner.nextLine();
        
        System.out.print("Masukkan Usia: ");
        double Usia = scanner.nextDouble();
        
        System.out.print("Masukkan gaji: ");
        double Gaji = scanner.nextDouble();
        
        // output data karyawan
        System.out.println("\nOutput Pendataan Karyawan:");
        System.out.println("Nama Karyawan : " + Nama_Karyawan);
        System.out.println("Alamat         : " + Alamat);
        System.out.println("Usia          : " + Usia + "tahun");
        System.out.println("Tinggi        : " + Gaji);
    }
}
