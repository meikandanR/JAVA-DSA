package zoho;

public class float_to_fraction {
    public static void main(String[] args) {
        double num=6.25;
        String result=findFraction(num);
        System.out.println(result);
    }
    public static String findFraction(double num){
        int Integer=(int)num;
        double fraction=num-Integer;
        int denominator=1;
        while(fraction!=Math.floor(fraction)){
            fraction*=10;
            denominator*=10;
        }
        int numerator=(int) fraction;
        int gcd=gcd(numerator,denominator);
        numerator/=gcd;
        denominator/=gcd;
        return Integer+" "+numerator+"/"+denominator;
    }
    public static int gcd(int a,int b){
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        }
    }

