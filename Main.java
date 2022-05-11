public class Main {
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    // list = LinkedList.addTail(list, "Hello");
    // list = LinkedList.addTail(list, "World!");
    // list = LinkedList.addHead(list, test);
    // list = LinkedList.addHead(list, 3);
    list = LinkedList.addHead(list, 0);
    list = LinkedList.addHead(list, 1);
    list = LinkedList.addHead(list, 2);
    list = LinkedList.addHead(list, 3);
    list = LinkedList.addHead(list, 4);
    list = LinkedList.addHead(list, 5);
    list = LinkedList.addHead(list, 6);
    list = LinkedList.addHead(list, 7);
    list = LinkedList.addHead(list, 8);
    list = LinkedList.addHead(list, 9);
    System.out.println("Number of Nodes: " + LinkedList.getCount());
    System.out.println("Value of node 2: " + (int)LinkedList.getValue(list, 2));
    LinkedList.printList(list);
    list = LinkedList.clear(list);
  }
}