import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;


public interface IWaitList<E> {
    void add(E element);

    E remove();

    boolean contains(E element);

    boolean containsAll(Collection<E> c);

    boolean isEmpty();
}