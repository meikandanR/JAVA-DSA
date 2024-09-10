package Company_ques;

public class Meta_Number {
    public static void main(String[] args) {
        int n=13;
        int count=0;
        for(int i=1;i<n;i++){
            if(i % 8 == 0 && i%10!=0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
