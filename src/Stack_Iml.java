public interface Stack_Iml {
    public boolean isEmpty();
    public int Size();
    public void push(Object e );
    public Object pop () throws NullPointerException;
    public Object peek() throws NullPointerException;
    public void stackPrinter(Node x);
}
