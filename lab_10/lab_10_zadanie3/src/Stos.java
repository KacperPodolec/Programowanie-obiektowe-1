import java.util.LinkedList;

public class Stos<T> {
    private LinkedList<T> stos = new LinkedList<>();

    public void push(T v) {
        stos.push(v);
    }

    public T peek() {
        return stos.peek();
    }

    public T pop() {
        return stos.pop();
    }

    boolean empty() {
        return stos.isEmpty();
    }

    @Override
    public String toString() {
        return stos.toString();
    }
}
