public class linkedList {
  private Node head;
  private Node tail;
  private static int count;

  public static int getCount() { return count; }

  public linkedList(){
    head = null;
    tail = null;
    count = 0;
  }

  public static linkedList addHead(linkedList list, int value) {
    Node newNode = new Node(value);
    if (list.head != null){
      list.head.prev = newNode;
    } else {
      list.tail = newNode;
    }
    newNode.next = list.head;
    list.head = newNode;
    count++;
    return list;
  }

    public static linkedList addTail(linkedList list, int value) {
    Node newNode = new Node(value);
    if (list.tail != null)
      list.tail.next = newNode;
    if (list.head == null) {
      list.head = newNode;
    }
    newNode.prev = list.tail;
    list.tail = newNode;
    count++;
    return list;
  }
}