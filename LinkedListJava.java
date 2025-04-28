import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(3);
        list.add(4);
        list.addLast(8);   //it is not present in arraylist.
        list.addFirst(1);
        System.out.println(list.getFirst());
    for (int i=0;i<list.size();i++){
        System.out.print(list.get(i));
        System.out.print(" ");
    }
    }
}
