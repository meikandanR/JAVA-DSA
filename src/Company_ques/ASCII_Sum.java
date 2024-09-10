package Company_ques;
import java.util.*;

public class ASCII_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
        int sum = 0;

        for (String str : s) {
            for (char c : str.toCharArray()) {
                sum += (c - 'A');
            }
        }

        System.out.println(sum);
    }
}

