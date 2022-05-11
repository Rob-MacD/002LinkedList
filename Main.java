public class Main {
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    // list = LinkedList.addTail(list, "Hello");
    // list = LinkedList.addTail(list, "World!");
    // list = LinkedList.addHead(list, test);
    // list = LinkedList.addHead(list, 3);
    list = LinkedList.addAt(list, 2, 0);
    list = LinkedList.addAt(list, 0, 1);
    list = LinkedList.addAt(list, 1, 2);
    list = LinkedList.addAt(list, 1, 3);
    list = LinkedList.addAt(list, 2, 4);
    list = LinkedList.addAt(list, 0, 5);
    list = LinkedList.addAt(list, 4, 6);
    System.out.println("Number of Nodes: " + LinkedList.getCount());
    System.out.println("Value of node 2: " + (int)LinkedList.getValue(list, 2));
  }
}