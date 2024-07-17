package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] str=sc.nextLine().split(",");
        ArrayList<Integer>array=new ArrayList<>();
        for(int i=0;i<str.length;i++){
            array.add(Integer.valueOf(str[i]));
        }
        int target=sc.nextInt();
        int res=check(array);

    }
    public static int check(ArrayList array){


        return 0;
    }
}
