package zoho;


import java.util.*;
public class shocks{
    public static void main(String[] args) {
        int[]array={10,10,20,30,20,40,40};
        int result=findPair(array);
        System.out.println(result);
    }
    public static int findPair(int[]array){
        int Paircount=0;

        Map<Integer,Integer> box=new HashMap<>();

        for(int i=0;i< array.length;i++){
            if(box.containsKey(array[i])){
                box.put(array[i],box.get(array[i])+1);
                if(box.get(array[i])>=2){
                    box.put(array[i],box.get(array[i])-2);
                    Paircount++;
                }
            }
            else{
                box.put(array[i],1);
            }
        }
        return Paircount;

    }
}
