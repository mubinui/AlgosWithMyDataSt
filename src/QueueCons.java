public interface QueueCons {
    public int size();
    public boolean isEmpty();
    public void enqueue(Object e );
    public Object dequeue() throws Exception;
    public Object peek()throws NullPointerException;
    public void printList(Node x);
}
