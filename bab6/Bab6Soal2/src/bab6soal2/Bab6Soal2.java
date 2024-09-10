/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soal2;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab6Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        String Grade;
        String keterangan;
        
        if (nilai >= 85 && nilai <= 100) {
            Grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 75 && nilai < 85) {
            Grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 65 && nilai < 75) {
            Grade = "C";
            keterangan = "Lulus";
        } else if (nilai >= 65 && nilai < 65) {
            Grade = "D";
            keterangan = "Tidak Lulus";
        } else {
            Grade = "E";
            keterangan = "Tidak Lulus";
            
        }
        
        
        System.out.println("Output :");
        System.out.println("Grade " + Grade);
        System.out.println("Keterangan : " + keterangan);
    }
    
}
