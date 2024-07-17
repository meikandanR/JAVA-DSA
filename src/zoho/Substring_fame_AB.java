package zoho;

public class Substring_fame_AB {
    public static void main(String[] args) {
        String A="Set";
        String B="Sangeet";
        boolean result=isPresent(A,B);
        System.out.println(result);
    }
    public static boolean isPresent(String A,String B){
        char[] Ach=A.toCharArray();
        char[] Bch=B.toCharArray();
        int i=0;
        int j=0;
        while(i< Ach.length && j<Bch.length){
            if(Ach[i]==Bch[j]){
                i++;
            }
            j++;
        }
        if(i== Ach.length){
            return true;
        }else {
            return false;
        }
    }
}
