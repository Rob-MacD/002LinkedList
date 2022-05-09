public class Main {
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    LinkedList test = new LinkedList();
    list = LinkedList.addTail(list, "Hello");
    list = LinkedList.addTail(list, "World!");
    list = LinkedList.addHead(list, test);
    list = LinkedList.addHead(list, 3);
    System.out.println("Number of Nodes: " + LinkedList.getCount());
  }
}