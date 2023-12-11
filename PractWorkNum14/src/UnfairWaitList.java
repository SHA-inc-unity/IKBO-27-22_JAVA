import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element); // Remove the specified element
    }

    public void moveToBack(E element) {
        content.remove(element); // Remove the element from its current position
        content.add(element);    // Add it to the back of the queue
    }
}