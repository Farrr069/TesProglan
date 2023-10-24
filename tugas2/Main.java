package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String angka;

        System.out.print("Masukan angka : ");

        try {
            angka = input.nextLine();
            if (isInputValid(angka)) {
                double RataRata = count(angka);
                System.out.println("rata rata angka : "+RataRata);

            } else {
                input.close();
                throw new EmptyException("Terjadi kesalahan");
            }
        } catch (EmptyException Ee) {
            System.out.println(Ee.getMessage());
        } 
    }

    public static boolean isInputValid(String input) {
        String[] ByNum = input.split(" ");

        for (int i = 0; i < ByNum.length; i++) {
            String num = ByNum[i];
            if (!num.matches("\\d+")) {
                return false; 
            }

            int angkaInt = Integer.parseInt(num);
            if (angkaInt < 1) {
                return false; 
            }
        }

        return true;
    }

    public static double count(String angka) {
        String[] ByNum = angka.split(" ");
        double Hasil = 0;
        for (int i = 0; i < ByNum.length; i++) {
            Hasil += Double.parseDouble(ByNum[i]);
        }
        return Hasil / ByNum.length;
    }
}