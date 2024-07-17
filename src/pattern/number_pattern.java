package pattern;

public class number_pattern {

    public static void main(String[] args) {
        int n=4;
        int  val=1;
        for(int i=1;i<n+1;i++){
            int temp[]=new int[i];
            for(int j=0;j<i;j++) {
                temp[j] = val;
                val++;
            }
            for(int j=i-1;j>=0;j--){
                System.out.print(temp[j]+" ");
            }
            System.out.println();
        }
    }


    }

