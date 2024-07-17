package hashtable;

public class max_min_freq {
    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        freq(arr, n);
    }

    public static void freq(int[] arr, int n) {
        boolean vis[] = new boolean[n];

        int minfre = n, maxfre = 0;
        int minele = 0, maxele = 0;
        for (int i = 0; i < n; i++) {
            if (vis[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    vis[j] = true;
                    count++;
                }
            }
                if (count > maxfre) {
                    maxele = arr[i];
                    maxfre = count;
                }
                if (count < minfre) {
                    minele = arr[i];
                    minfre = count;
                }
            }
            System.out.println("lowest frequency element is:" + minele);
            System.out.println("highest frequency element is:" + maxele);

        }
    }

