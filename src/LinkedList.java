public class LinkedList {
    Node head ;
    Node tail ;

    public void printList(Node x){
        this.head = x;
        for(Node n = head; n!=null; n=n.next){
            System.out.print(n.elem+"->");
        }

    }
    public void add(Object e){
        if (head.elem==null){
            head = new Node(e,null);
            tail = head;

        }
        else{
            Node x = new Node(e,null);
            tail.next = x;
            tail = tail.next;
        }

    }


}
