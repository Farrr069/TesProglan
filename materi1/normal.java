package materi1;

import java.util.Scanner;

public class normal {
    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Masukkan Angka Pertama : ");
        a = masukkan.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        b = masukkan.nextInt();

        c = a+b;

        System.out.println("Hasil Penjumlahan = "+c);

    }
    
}
