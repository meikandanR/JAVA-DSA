package String;
import java.util.*;
import java.util.Scanner;

public class Printingletter {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String ans = "";

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    if (i + 1 < s.length() && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') {
                        String val = Character.toString(s.charAt(i + 1));
                        int j = i + 1;

                        while (j + 1 < s.length() && s.charAt(j + 1) >= '0' && s.charAt(j + 1) <= '9') {
                            val += Character.toString(s.charAt(j + 1));
                            j++;
                        }

                        for (int k = 0; k < Integer.parseInt(val); k++) {
                            System.out.print(ans);
                        }

                        ans = "";
                        i = j; // Update `i` to `j` after processing the digits.
                    } else {
                        ans += s.charAt(i);
                    }
                }
            }

            sc.close();
        }
    }


