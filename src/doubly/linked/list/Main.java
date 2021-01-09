


package doubly.linked.list;

public class Main {

    public static void main(String[] args)
    {
        
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertFirst(1);
        obj.insertLast(404);
        obj.insertAt(0, 606);
        obj.insertAt(2, 2);
        obj.insertLast(3);
        obj.insertLast(4);
        obj.insertLast(707);
        obj.removeFirst();
        obj.removeLast();
        obj.removeAt(2);
        obj.removeAt(3);
        obj.print();
        System.out.println();
        obj.printReverse();
    }
    

   
}
