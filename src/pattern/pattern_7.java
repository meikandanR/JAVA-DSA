package pattern;
/*
1   1
 2 2
  3
 2 2
1   1

 */
public class pattern_7 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            if (i != n) {
                for (int j = 2 * (n - i) - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }

        // Print the bottom part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            if (i != n) {
                for (int j = 2 * (n - i) - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
