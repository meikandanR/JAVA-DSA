package leetcode;

public class posible_productCombination {

        public static void main(String[] args) {
            int target=60;
            int []arr={5,3,20,10,1,4,2};
            System.out.print(possibleCombination(arr,target));
        }
        public static int possibleCombination(int arr[],int target){

            int count=0;
            int len=arr.length;
            for(int i=0;i<len-2;i++){
                for(int j=i+1;j<len-1;j++){
                    for(int k=j+1;k<len;k++){
                        if(arr[i]*arr[j]*arr[k]==target){
                            count++;
                        }
                    }
                }
            }
            return count;
        }

    
}
