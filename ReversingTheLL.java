public class ReversingTheLL {
    

    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
        public  void addFirst(String data){

          Node newNode=new Node(data);
          newNode.next=head;
          head=newNode;
          size++;

        }
        public void addLast(String data){
            Node newNode= new Node(data);

            if(head==null){
                head=newNode;
                return;
            }
            Node lastNode=head;
            while(lastNode.next!=null){
               lastNode=lastNode.next;
            }
            size++;
            lastNode.next=newNode;
        }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next; // Save next
            currNode.next = prevNode;      // Reverse link
            prevNode = currNode;           // Move prev forward
            currNode = nextNode;           // Move current forward
        }

        head = prevNode; // Update head
    }

        public  void printList(){
            Node currNode=head;

            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.println("null");
        }
        public void removeFirst(){
        if(head==null){
            System.out.println("Empty list nothing to delete");
            return;
        }
        head=head.next;
        size--;

        }
        public void removeLast(){
            if(head==null){
                System.out.println("Empty list nothing to delete");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node currNode=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                currNode=currNode.next;
                lastNode=lastNode.next;
            }
            currNode.next=null;

        }
        public int  getSize(){
        return size;
        }





    public static void main(String[] args) {
        ReversingTheLL list = new ReversingTheLL();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.reverseList();
        list.printList();



    }
}



