
package pertemuan6;

import java.util.Scanner;

public class latihan28_gantiKata {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Mengganti Kata=====");
        
        // Meminta input kalimat dari user
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Meminta input kata yang ingin diganti
        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine();
        
        // Meminta input kata pengganti
        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();
        
        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);
        
        // Menampilkan hasil
        System.out.println("\n=====Hasil Formatting=====");
        System.out.println("Kalimat awal: " + kalimat);
        System.out.println("Kalimat baru: " + kalimatBaru);
        
        scanner.close();
    }
}
