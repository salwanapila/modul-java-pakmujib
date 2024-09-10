/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab7soal1;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab7Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
       System.out.print("Nilai Awal ? : ");
        int nilaiAwal = scanner.nextInt( );
        
        System.out.print("Nilai Akhir ? : ");
        int nilaiAkhir = scanner.nextInt( );
        
        System.out.println("Hasilnya : ");
        int count = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(count + ". " + i);
            count++;
        }
        // TODO code application logic here
    }
    
}
