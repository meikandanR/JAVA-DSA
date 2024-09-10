package leetcode.leetcode;

public class meta_number {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%10!=0){
                if(i%1==0 && i%2==0 && i%4==0 && i%8==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
