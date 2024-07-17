package ArrayList;

import java.util.ArrayList;

public class basicCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();


        //to add element in list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get the element in list

        System.out.println(list.get(1));

        //remove element in list
        list.remove(1);
        System.out.println();

        //modifying the list

        list.set(0,3);
        System.out.println(list);

        //to find element is present in the list
        System.out.println(list.contains(3));


        //size of list

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println();

    }
}
