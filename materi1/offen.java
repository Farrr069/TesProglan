package materi1;

import java.util.Scanner;

public class offen {
    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Masukkan Angka Pertama : ");
        
        do {
            a = masukkan.nextInt();
            if(a<=0){
            System.out.println("Angka Tidak Boleh 0 ");
            System.out.print("Masukan angka lagi : ");
        }
        } while (a<=0);
        

        System.out.print("Masukkan Angka Kedua : ");

        do {
            b = masukkan.nextInt();
            if(b<=0){
            System.out.println("Angka Tidak Boleh 0 ");
            System.out.print("Masukan angka lagi : ");
        }
        } while (b<=0);

        c = a+b;

        System.out.println("Hasil Penjumlahan = "+c);

    }
    
}
