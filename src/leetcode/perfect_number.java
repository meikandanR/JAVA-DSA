package leetcode;

public class perfect_number {
        static boolean checkPerfectNumber(int num) {
            int sum=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    sum+=i;
                }
            }
            if(sum==num){
                return true;
            }
            return false;
        }
        public static void main(String args[]){
            int n=28;
            if(checkPerfectNumber(n)){
                System.out.println("yes");
            }
            else
                System.out.println("Not perfect number");
    }
}
