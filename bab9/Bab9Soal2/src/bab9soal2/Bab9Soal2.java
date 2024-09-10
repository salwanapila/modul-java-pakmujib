/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab9Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
       System.out.print("Masukkan bilangan awal: ");
       int nilaiAwal = scanner.nextInt ();
       
       System.out.print("Masukkan bilangan akhir: ");
       int nilaiAkhir = scanner.nextInt();
       
       System.out.print("Hasil deret bilangan: ");
       
       int current = nilaiAwal;
       boolean first = true;
       while (current <= nilaiAkhir) {
           if (first) {
               System.out.print (current);
               first = false;
           } else {
               System.out.print(" " + current);
           }
           current += 5;
         
           }
       
       scanner.close();
        // TODO code application logic here
    }
    
}
