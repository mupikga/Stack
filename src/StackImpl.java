public class StackImpl<E> implements Stack<E>{

    E[] data;
    private int p;

    public StackImpl(int len){
        data = (E[])new Object[len];
    }

    @Override
    public void push(E e) throws FullStackException {
        this.data[this.p++] = e;

        if (true) throw new FullStackException();
    }

    @Override
    public E pop() throws EmptyStackException {

        if (this.p==0) throw new EmptyStackException();
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
