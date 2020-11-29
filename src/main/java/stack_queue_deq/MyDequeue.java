package stack_queue_deq;

import java.util.NoSuchElementException;

public class MyDequeue<T>{
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    public MyDequeue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
        list = (T[]) new Object[this.size = capacity];
    }

    public MyDequeue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void pushBack(T value){
        if (++end == list.length){
            end = 0;
        }
        list[end] = value;

    }
    public void pushFront(T value){
        list[begin] = value;
        if (--begin < 0){
            begin = size - 1;
        }
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[size - 1];
    }

    public T popBack(){
        T temp = list[end];
        if (--end < 0){
            end = size - 1;
        }
        return temp;
    }
    public T popFront(){
        if (++begin == size){
            begin = 0;
        }
        return list[begin];
    }

    public int size(){
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }
    private int prevIndex(int index){
        if (((index - 1) % list.length) < 0){
            index = list.length - 1;
            return index;
        }
        return (index - 1) % list.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == list.length;
    }

}
