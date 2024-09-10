/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6soal1;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Bab6Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();

        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();

        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();

        String grade;

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 55) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("NILAI : " + nilai);
        System.out.println("Grade : " + grade);
    }
    
}
