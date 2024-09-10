package pattern;

import java.util.Scanner;

public class Alphabets {

        public static void main(String[] args) {
            int n = 4; // Number of lines
            char startChar = 'A';

            for (int i = 0; i < n; i++) {
                for (int j = i; j >= 0; j--) {
                    System.out.print((char)(startChar + j) + " ");
                }
                System.out.println();
            }
        }

    }
