/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan24.bandingduanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : program untuk membandingkan dua buah nilai
 */
public class PBO210118068Latihan24BandingDuaNilai {

    public static int nilai1, nilai2;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;
        
        System.out.print("========Program Perbandingan Nilai========");
        
        while(again) {
            System.out.print("\nMasukkan nilai pertama : ");
            nilai1 = scanner.nextInt();
            
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = scanner.nextInt();
            
            System.out.println("Hasil : " + nilai1 + banding() + nilai2);
            
            System.out.print("\nUlangi aktifitas ? (Ya/Tidak) : ");
            
            if(scanner.next().toLowerCase().equals("tidak"))
                again = false;
        }
        
    }
    
    /**
     * Membandingkan nilai
     * 
     * @return String
     */
    public static String banding() {
        if(nilai1 > nilai2) return " Lebih besar dari ";
        else if (nilai1 < nilai2) return " Lebih kecil dari ";
        else return " Sama dengan ";
    }
    
}
