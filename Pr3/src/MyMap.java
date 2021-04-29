import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MyMap<K, V> extends HashMap {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        Lock lock = new ReentrantLock();
        lock.lock();
        boolean buff = super.isEmpty();
        lock.unlock();
        return buff;
    }

    @Override
    public boolean containsKey(Object key) {
        Lock lock = new ReentrantLock();
        lock.lock();
        boolean buff = super.containsKey(key);
        lock.unlock();
        return buff;
    }

    @Override
    public boolean containsValue(Object value) {
        Lock lock = new ReentrantLock();
        lock.lock();
        boolean buff = super.containsValue(value);
        lock.unlock();
        return buff;
    }

    @Override
    public Object get(Object key) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.get(key);
        lock.unlock();
        return buff;
    }

    @Override
    public Object put(Object key, Object value) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.put(key, value);
        lock.unlock();
        return buff;
    }

    @Override
    public Object remove(Object key) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.remove(key);
        lock.unlock();
        return buff;
    }

    @Override
    public void putAll(Map m) {
        Lock lock = new ReentrantLock();
        lock.lock();
        super.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        Lock lock = new ReentrantLock();
        lock.lock();
        super.clear();
        lock.unlock();
    }

    @Override
    public Set keySet() {
        Lock lock = new ReentrantLock();
        lock.lock();
        Set buff = super.keySet();
        lock.unlock();
        return buff;
    }

    @Override
    public Collection values() {
        Lock lock = new ReentrantLock();
        lock.lock();
        Collection buff = super.values();
        lock.unlock();
        return buff;
    }

    @Override
    public Set<Entry> entrySet() {
        Lock lock = new ReentrantLock();
        lock.lock();
        Set<Entry> buff = super.entrySet();
        lock.unlock();
        return buff;
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.getOrDefault(key, defaultValue);
        lock.unlock();
        return buff;
    }

    @Override
    public void forEach(BiConsumer action) {
        Lock lock = new ReentrantLock();
        lock.lock();
        super.forEach(action);
        lock.unlock();
    }

    @Override
    public void replaceAll(BiFunction function) {
        Lock lock = new ReentrantLock();
        lock.lock();
        super.replaceAll(function);
        lock.unlock();
    }

    @Override
    public Object putIfAbsent(Object key, Object value) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.putIfAbsent(key, value);
        lock.unlock();
        return buff;
    }

    @Override
    public boolean remove(Object key, Object value) {
        Lock lock = new ReentrantLock();
        lock.lock();
        boolean buff = super.remove(key, value);
        lock.unlock();
        return buff;
    }

    @Override
    public boolean replace(Object key, Object oldValue, Object newValue) {
        Lock lock = new ReentrantLock();
        lock.lock();
        boolean buff = super.replace(key, oldValue, newValue);
        lock.unlock();
        return buff;
    }

    @Override
    public Object replace(Object key, Object value) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.replace(key, value);
        lock.unlock();
        return buff;
    }

    @Override
    public Object computeIfAbsent(Object key, Function mappingFunction) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.computeIfAbsent(key, mappingFunction);
        lock.unlock();
        return buff;
    }

    @Override
    public Object computeIfPresent(Object key, BiFunction remappingFunction) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.computeIfPresent(key, remappingFunction);
        lock.unlock();
        return buff;
    }

    @Override
    public Object compute(Object key, BiFunction remappingFunction) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.compute(key, remappingFunction);
        lock.unlock();
        return buff;
    }

    @Override
    public Object merge(Object key, Object value, BiFunction remappingFunction) {
        Lock lock = new ReentrantLock();
        lock.lock();
        Object buff = super.merge(key, value, remappingFunction);
        lock.unlock();
        return buff;
    }
}