


public class ArrayQueue<E>implements Queue<E> {

    E data[];
    static int capacity = 100;
    int f = 0;
    int sz = 0;

    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(capacity);


    }

    @Override
    public boolean isempty() {
        return sz == 0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E firast() {
        if (isempty()) return null;
        return data[f];
    }

    @Override
    public void enqueue(E element) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Queue is full");
        int x = (f + sz) % data.length;
        data[x] = element;
        sz++;

    }

    @Override
    public E dequeue()

    {
        if (isempty()) return null;

        E del = data[f];
        data[f] = null;
        f = (f + 1) % data.length;

    }
}