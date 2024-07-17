package zoho;

import java.util.Scanner;

public class distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int distance=n;
        int result=findDistance(array,distance);
        System.out.println(result);

    }
    public static int findDistance(int[]array,int distance){

        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    if(j-i<distance) {
                        distance = j-i;
                    }
                }
            }
        }
        return distance;
    }
}
