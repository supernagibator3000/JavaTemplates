import java.util.*;

public class MySet<E> extends HashSet {
    @Override
    public synchronized int size() {
        return super.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public synchronized Iterator iterator() {
        return super.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return super.toArray();
    }

    @Override
    public synchronized boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public synchronized boolean addAll(Collection c) {
        return super.addAll(c);
    }

    @Override
    public synchronized void clear() {
        super.clear();
    }

    @Override
    public synchronized Spliterator spliterator() {
        return super.spliterator();
    }

    @Override
    public synchronized boolean removeAll(Collection c) {
        return super.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection c) {
        return super.retainAll(c);
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return super.containsAll(c);
    }

    @Override
    public synchronized Object[] toArray(Object[] a) {
        return super.toArray(a);
    }
}
