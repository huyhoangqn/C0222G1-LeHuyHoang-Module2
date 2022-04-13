package _10_dsa.exercise.linkedlist;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("Hoàng");
        linkedList.add(1, "Tú");
        linkedList.add(1, "Minh");
        linkedList.add(1, "Ly");
        linkedList.printList();

        linkedList.add(4,"Huong");
        linkedList.add(5,"Loi");

        System.out.println(" First tem :" + linkedList.getFirst());
        linkedList.printList();
        System.out.println("Last item : " + linkedList.getLast());
        linkedList.printList();

        linkedList.remove(3);
        System.out.println("delete third item :" );
        linkedList.printList();
        System.out.println("size of array :");
        System.out.println(linkedList.size());
    }
}
