package Array;
import java.util.Scanner;
public class Rotate_array {

        // Function to rotate digits of a number by K
        public static int rotateDigits(int num, int k) {
            // Convert num to a string
            String numStr = Integer.toString(num);
            int len = numStr.length();

            // Ensure that k is within the range of length of the number
            k = k % len;

            // Rotate the string by k
            String rotatedStr = numStr.substring(k) + numStr.substring(0, k);

            // Convert the rotated string back to integer
            return Integer.parseInt(rotatedStr);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input number
            System.out.print("Enter the number: ");
            int num = scanner.nextInt();

            // Input K
            System.out.print("Enter the value of K: ");
            int k = scanner.nextInt();

            // Rotate digits by K
            int rotatedNum = rotateDigits(num, k);

            // Output the rotated number
            System.out.println("Rotated number: " + rotatedNum);

            scanner.close();
        }
    }


