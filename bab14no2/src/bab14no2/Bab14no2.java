/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab14no2;

/**
 *
 * @author user
 */
public class Bab14no2 {

    / Abstract class Hewan
    abstract class Hewan {
    // Method suara
    public abstract void suara();
    }

    // Child class Burung yang meng-extend dari Hewan
    class Burung extends Hewan {
    // Implementasi dari method abstract suara
    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
}

    // Main class untuk menjalankan program
    public class Burungmain {
        public static void main(String[] args) {
        // Membuat objek dari kelas Burung
        Hewan burung = new burung();
        // Memanggil method suara
        burung.suara();
       }
    }
}
