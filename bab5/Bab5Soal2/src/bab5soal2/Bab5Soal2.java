/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab5soal2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab5Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan nilai alas: ");
        double alas = input.nextDouble();
        
        System.out.print("Masukkan nilai Tinggi: ");
        double Tinggi = input.nextDouble();
        double tinggi = 0;
        
        //Menghitung luas segitiga
        double luas = (alas * tinggi) / 2; 
        
        System.out.println("Luas Segitiga : " + luas);
       input.close();
    }
    
}
