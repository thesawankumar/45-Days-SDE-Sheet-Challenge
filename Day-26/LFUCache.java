import java.util.*;

class LFUCache {

    class Node {
        int key, val, freq = 1;
        Node(int k, int v) {
            key = k;
            val = v;
        }
    }

    int cap, minFreq = 0;
    Map<Integer, Node> cache = new HashMap<>();
    Map<Integer, LinkedHashSet<Integer>> freqMap = new HashMap<>();

    public LFUCache(int capacity) {
        cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        int f = node.freq;
        freqMap.get(f).remove(key);

        if (f == minFreq && freqMap.get(f).isEmpty())
            minFreq++;

        node.freq++;
        freqMap.computeIfAbsent(node.freq, k -> new LinkedHashSet<>()).add(key);

        return node.val;
    }

    public void put(int key, int value) {
        if (cap == 0) return;

        if (cache.containsKey(key)) {
            cache.get(key).val = value;
            get(key);
            return;
        }

        if (cache.size() == cap) {
            int evict = freqMap.get(minFreq).iterator().next();
            freqMap.get(minFreq).remove(evict);
            cache.remove(evict);
        }

        Node node = new Node(key, value);
        cache.put(key, node);
        minFreq = 1;
        freqMap.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
    }
}