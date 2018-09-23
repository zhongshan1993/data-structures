/**
 * Created by Zhongshan on 2018/9/23.
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
