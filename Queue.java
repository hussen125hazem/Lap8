/**
 * Created by user on 14/03/22.
 */
public interface Queue<E> {
    boolean isempty();
    int size();
    E firast();
    void enqueue(E element);
    E dequeue();

}
