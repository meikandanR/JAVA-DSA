package Recursion;
import java.util.*;
public class palindrom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = ispalin(s, 0, s.length() - 1);
        System.out.println(ans);
    }

    public static boolean ispalin(String s, int i, int j) {
        if (i > j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return ispalin(s, i + 1, j - 1);

    }
}
