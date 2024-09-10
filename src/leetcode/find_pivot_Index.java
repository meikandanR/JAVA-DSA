package leetcode;

public class find_pivot_Index {
    public static void main(String[] args) {
            int arr[]={-3,-1,-1,-1};
            int ans=check(arr);
            if(ans==-1){
                System.out.print("NOT FOUND");
            }
            else{
                System.out.print(ans);
            }
        }
        public static int check(int []arr){
            int len=arr.length;
            for(int i=0;i<len;i++){
                int leftsum=0;
                int rightsum=0;
                if(i==0){
                    leftsum=0;
                    for(int k=1;k<len;k++){
                        rightsum+=arr[k];
                    }

                }
                else if(i==arr.length-1){
                    rightsum=0;
                    for(int k=arr.length-2;k>=0;k--){
                        leftsum+=arr[k];
                    }
                }
                else{
                    for(int j=0;j<i;j++){
                        leftsum+=arr[j];
                    }
                    for(int j=i+1;j<len;j++){
                        rightsum+=arr[j];
                    }
                }
                if(leftsum==rightsum){
                    return i+1;
                }

            }
            return -1;
        }
    }

