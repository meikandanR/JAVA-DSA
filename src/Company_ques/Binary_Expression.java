package Company_ques;

public class Binary_Expression {
    public static void main(String[] args) {
        String s="1C0C1C1A0B1";
        System.out.println(binaryOperation(s));
    }
    public static  int binaryOperation(String str){
        int res=str.charAt(0)-'0';
        for (int i = 1; i < str.length ();)
        {
            char prev = str.charAt (i);
            i++;
            if (prev == 'A')
                res = res & (str.charAt (i) - '0');
            else if (prev == 'B')
                res = res | (str.charAt (i) - '0');
            else
                res = res ^ (str.charAt (i) - '0');
            i++;
        }
        return res;
    }
}
