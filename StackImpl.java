public class StackImpl<E> implements Stack<E>{

    private E[] data;
    private int i=0;

    public StackImpl(int len){
        data = (E[])new Object[len];
    }

    @Override
    public void push(E e) throws FullStackException {
        if (i < data.length){
            data[i]=e;
            i++;
        }
        else
            throw new FullStackException();
    }

    @Override
    public E pop() throws EmptyStackException {
        if (data.length==0) throw new EmptyStackException();
        int u = 0;
        while (u<data.length) {
            System.out.println("Pop: "+ data[u]);
            u++;
        }
        E e= data[u-1];
        return e;
    }

    @Override
    public int size() {
        return data.length;
    }
}
