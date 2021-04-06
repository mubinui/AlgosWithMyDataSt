public class Stack implements Stack_Iml{
    int size = 0;
    Node head ;
    Node tail ;
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int Size() {
        return size;
    }

    @Override
    public void push(Object e) {
        if (head==null){
            head = new Node(e,null);
            tail = head ;

        }
        else{
            Node x = new Node(e,null);
            x.next = head;
            head = x;

        }
        size++;

    }

    @Override
    public Object pop() throws NullPointerException {
        Object show;
        show = null;
        if (!isEmpty()){
            show = head.elem;
            Node x = head ;
            head = head.next;
            x.next = null;
            size--;

        }
        return show;
    }

    @Override
    public Object peek() throws NullPointerException {
        Object pk = null;
        if (!isEmpty()){
            pk = head.elem;

        }
        return pk;
    }


    public void stackPrinter(Node x ){
        for(Node n = x; n!=null; n=n.next){
            System.out.print(n.elem+"->");
        }
        System.out.println();
    }
}
