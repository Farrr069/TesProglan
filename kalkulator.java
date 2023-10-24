import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0.0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 1) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Pembagian oleh nol tidak diperbolehkan.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                System.exit(1);
        }

        System.out.println("Hasil: " + hasil);
        input.close();
}
}
