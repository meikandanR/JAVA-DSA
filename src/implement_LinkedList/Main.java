package implement_LinkedList;
public class Main {
    public static void main(String[] args) throws Exception{
        implement_Linked_List ll=new implement_Linked_List();
        ll.addlast(10);
        ll.addlast(20);
        ll.addlast(30);
        ll.addlast(40);
        ll.addlast(50);
        ll.addlast(60);
        ll.addlast(70);
        ll.addfirst(100);
        ll.addfirst(200);
        System.out.println(ll.getfirst());
        System.out.println(ll.getlast());
        System.out.println(ll.getAt(2));
        System.out.println(ll.getNodeAt(4));
        ll.removefirst();



    }
}
