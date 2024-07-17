package zoho;

public class Find_Count_In_Infinite_String {
    public static void main(String[] args) {
        String S="aabba";
        int N=10;
        int result=find_count(S,N);
        System.out.println(result);
    }
    public static int find_count(String S,int N){
        int count=0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='a'){
                count+=1;
            }
        }
        int otherStr=N/S.length();
        count=count*otherStr;
        if(N%S.length()<S.length()){
            for(int i=0;i<N%S.length();i++){
                if(S.charAt(i)=='a'){
                    count+=1;
                }
            }
        }
        return count;
    }
}
