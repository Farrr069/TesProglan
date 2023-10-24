package tugas3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau kalimat: ");
        String input = scanner.nextLine(); 

        if (isPalindrome(input)) { //memeriksa apakah input palindrome atau bukan di method isPalindrome
            System.out.println("Input adalah palindrome.");
        } else {
            System.out.println("Input bukan palindrome.");
        }
        scanner.close();

    }

    public static boolean isPalindrome(String input) {

        //Program harus mengabaikan spasi, huruf kapital atau kecil, dan tanda baca.

        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
        

        int length = cleanInput.length();
        for (int i = 0; i < length; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

