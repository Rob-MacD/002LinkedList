public class Main {
  public static void main(String[] args){
    linkedList list = new linkedList();
    list = linkedList.addTail(list, 5);
    list = linkedList.addTail(list, 7);
    list = linkedList.addHead(list, 1);
    list = linkedList.addHead(list, 3);
    System.out.println("Number of Nodes: " + linkedList.getCount());
    
  }
}