import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    private List<Entry<K,V>> heap ;
    public MainPriorityQueue() {
        super();
        this.heap = new ArrayList<Entry<K,V>>();
    }

    public MainPriorityQueue(Comparator<K> comparator) {
        super(comparator);
        this.heap = new ArrayList<Entry<K,V>>();
    }

    @Override
    public int size() {
        return this.heap.size();
    }

    @Override
    public Entry<K, V> insert(K key, V value) {
        Entry<K,V> newEntry = new PQEntry<K,V>(key, value);
        this.heap.add(newEntry);
        return newEntry;
    }

    @Override
    public Entry<K, V> min() {
        if (this.isEmpty()) {
            return null;
        }
        else {
            return this.heap.get(0);
        }
    }

    @Override
    public Entry<K, V> removeMin() {
        if (this.isEmpty()) {
            return null;
        }
        else {
            Entry<K,V> result = this.min();
            int target = this.size()-1;
            this.heap.remove(target);
            return result;

        }
    }
}