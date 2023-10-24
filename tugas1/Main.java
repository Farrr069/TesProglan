package tugas1;

public class Main {
      
   
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averange = sum / numbers.length;
        System.out.println("rata-rata : " + averange);
    }
}