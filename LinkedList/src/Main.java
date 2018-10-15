/**
 * Created by Zhongshan on 2018/10/13.
 */
public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 5; i++) {
//            linkedList.addFirst(i);
//            System.out.println(linkedList);
//        }
//
//        linkedList.add(2, 666);
//        System.out.println(linkedList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

        LinkedList.Node head = linkedList.getHead();
        System.out.println(LinkedList.isPalindrome(head));
    }


}
