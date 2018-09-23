/**
 * Created by Zhongshan on 2018/9/23.
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
