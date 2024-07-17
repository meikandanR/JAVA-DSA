package Recursion.tuff_problem;

public class printSubString {
    /*public static void printsub(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        printsub(str.substring(1), ans + ch);
        printsub(str.substring(1), ans);

    }

    public static void main(String args[]) {
        printsub("abc", "");
    }*/
    // Java program to count substrings
// with same first and last characters

        // Function to count substrings
        // with same first and
        // last characters
        static int countSubstrs(String str, int i,
                                int j, int n)
        {
            // base cases
            if (n == 1)
                return 1;
            if (n <= 0)
                return 0;

            int res = countSubstrs(str, i + 1, j, n - 1) +
                    countSubstrs(str, i, j - 1, n - 1) -
                    countSubstrs(str, i + 1, j - 1, n - 2);

            if (str.charAt(i) == str.charAt(j))
                res++;

            return res;
        }

        public static void main (String[] args)
        {
            String str = "abcab";
            int n = str.length();
            System.out.print(countSubstrs(str, 0, n - 1, n));
        }
    }

