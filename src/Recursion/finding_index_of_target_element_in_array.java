package Recursion;

public class finding_index_of_target_element_in_array {

    public static void main(String args[]){
        int [] arr={10,20,10,30,40,5,10};
        int target=10;
        find_element(arr,target,0);
    }
    public static void find_element(int [] arr,int target,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            System.out.println(i);
        }
        find_element(arr,target,i+1);
    }
}
