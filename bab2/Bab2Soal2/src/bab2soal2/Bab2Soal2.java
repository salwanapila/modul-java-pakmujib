/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab2soal2;

/**
 *
 * @author user
 */
public class Bab2Soal2 {

    /**
     * @param args the command line arguments
     */
    
    public static String Hobi;
    public static final String Hewan = "Ikan Hias";
    
    // Menambahkan variabel statis baru
    public static final String Makanan = "Ayam Geprek";
    public static final String Minuman = "Jus Jambu";
    
    public static void main(String[] args) {
        Hobi = "Sepak Bola";// Mengisi Value pada variable Hobi
        System.out.println("Hobi Saya " + Hobi);// Memanggil Variable Hobi
        System.out.println("Peliharaan Saya " + Hewan);// Memanggil Variable Hewan
        
        // Menambahkan output untuk variabel Makanan dan Minuman
        System.out.println("Makanan Favorit saya : " + Makanan);
        System.out.println("Minuman Favorit saya : " + Minuman);
    }
    
}
