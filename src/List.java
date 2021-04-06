public class List implements QueueCons{
    int size = 0;
    Object front = null;
    Object rear = null;


    Node head ;
    Node tail ;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void enqueue(Object e) {
        if (isEmpty()){
            head = new Node(e,null);
            tail = head ;
            rear = head.elem;

        }
        else{
            Node n = new Node(e,null);
            tail.next = n;
            tail = tail.next;
            rear = tail.elem;
        }
        size++;


    }

    @Override
    public Object dequeue() throws Exception {
        Object p = null;
        if (!isEmpty()){
            p = head.elem;
            Node x = head;
            head = head.next;
            x.next = null;
            size--;

        }

     return p;
    }

    @Override
    public Object peek() throws NullPointerException{

        if (!isEmpty()){
            front = head.elem;
        }
        return front;
    }

    @Override
    public void printList(Node x) {

        for (Node n = x; n!=null;n=n.next ){
            System.out.print(n.elem+"->");
        }
        System.out.println();

    }
}
