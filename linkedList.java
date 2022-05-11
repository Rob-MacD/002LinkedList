public class LinkedList {
  private Node<?> head;
  private Node<?> tail;
  private static int count;

  public LinkedList(){
    head = null;
    tail = null;
    count = 0;
  }
  
  public class Node<T> {
  T data;
  Node<T> next;
  Node<T> prev;

  public Node(T d){
    this.data = d;
    this.next = null;
    this.prev = null;
  }
}

  public static LinkedList addHead(LinkedList list, Object value) {
    Node newNode = list.new Node(value);
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
    Node newNode = list.new Node(value);
    if (list.tail != null)
      list.tail.next = newNode;
    if (list.head == null) 
      list.head = newNode;
    newNode.prev = list.tail;
    list.tail = newNode;
    count++;
    return list;
  }

  public static LinkedList addAt(LinkedList list, int index, Object value) {
    if (index <= 0)
      addHead(list, value);
    else if (index >= getCount())
      addTail(list, value);
    else {
      Node newNode = list.new Node(value);
      Node current = list.head;
      for(int i = 0; i < index; i++)
        current = current.next;
      //Set new node to point to proper nodes
      newNode.prev = current.prev;
      newNode.next = current;
      //Modify adjacent nodes:
      current.prev.next = newNode;
      current.prev = newNode;
      count++;
    }
    return list;
  }

  public static LinkedList removeHead(LinkedList list){
    Node<?> current = list.head;
    current = current.next;
    current.prev = null;
    list.head = current;
    return list;
  }

  public static LinkedList removeTail(LinkedList list){
    Node<?> current = list.tail;
    current = current.prev;
    current.next = null;
    list.tail = current;
    return list;
  }

  public static LinkedList removeAt(LinkedList list, int index){
    if (index <= 0)
      removeHead(list);
    else if (index >= getCount())
      removeTail(list);
    Node current = list.head;
      for (int i = 0; i < index; i++){
        current = current.next;
    }
    current.prev.next = current.next;
    current.next.prev = current.prev;
    current.next=null;
    current.prev=null;
    return list;
  }

  public static LinkedList clear(LinkedList list){
    if (getCount() > 0){
      Node current = list.tail;
      for(int i = 0; i < getCount(); i++){
        current.data = null;
        current = current.prev;
        current.next.prev = null;
        current.next = null;
      }
      //once more for the head:
      current.data = null;
      current.next = null;
    }
    return list;
  }
  
  public static Object getValue(LinkedList list, int index){
    Node<?> current = list.head;
    for(int i = 0; i < index; i++) {
      current = current.next;
    }
    return current.data;
  }

  public static int getCount() {
    return count;
  }

}