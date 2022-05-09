public class LinkedList {
  private Node head;
  private Node tail;
  private static int count;

  public static int getCount() { return count; }

  public LinkedList(){
    head = null;
    tail = null;
    count = 0;
  }

  public static LinkedList addHead(LinkedList list, Object value) {
    Node newNode = new Node(value);
    if (list.head != null)
      list.head.prev = newNode;
    else 
      list.tail = newNode;
    newNode.next = list.head;
    list.head = newNode;
    count++;
    return list;
  }

    public static LinkedList addTail(LinkedList list, Object value) {
    Node newNode = new Node(value);
    if (list.tail != null)
      list.tail.next = newNode;
    if (list.head == null) 
      list.head = newNode;
    newNode.prev = list.tail;
    list.tail = newNode;
    count++;
    return list;
  }
}