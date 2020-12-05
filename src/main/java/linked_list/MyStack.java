package linked_list;

public class MyStack<T> {
    MyLinkedList<T> stack = new MyLinkedList<>();

    public int size(){
        return stack.size();
    }
    public T peek(){
        return stack.getFirst();
    }
    public T pop(){
        return stack.removeFirst();
    }
    public void push(T item){
        stack.insertFirst(item);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
