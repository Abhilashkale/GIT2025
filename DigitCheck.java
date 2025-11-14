import java.util.Scanner;

public class DigitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
		
        scanner.close();
        
        if (hasEight(number)) {
            System.out.println("The number contains the digit 8.");
        } else {
            System.out.println("The number does not contain the digit 8.");
        }
    }
    
    public static boolean hasEight(int number) {
        return String.valueOf(number).contains("8");
    }
}
