package hash_map;

import java.util.LinkedList;

public class ChainingHashMap<Key, Value> {
    private int capacity = 7;
    private int size;

    private LinkedList<Node<Key, Value>>[] st;

    public ChainingHashMap() {
        st = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            st[i] = new LinkedList<>();
        }
    }

    private class Node<Key, Value> {
        Key key;
        Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private void checkKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public void put(Key key, Value value) {
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node<Key, Value> node : st[i]) {
            if (key.equals(node.key)) {
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node<Key, Value>(key, value));
        size++;
    }

    public Value get(Key key) {
        checkKeyNotNull(key);
        int i = hash(key);
        for (Node<Key, Value> node : st[i]) {
            if (key.equals(node.key)) {
                return node.value;
            }
        }
        return null;
    }

    public Key remove (Key key){
        checkKeyNotNull(key);
        int j = hash(key);
        for (int i = 0; i < st[j].size(); i++) {
                st[j].remove(i);
                size--;
        }
        return key;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            for (Node<Key, Value> node : st[i]) {
                sb.append(node.key).append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
