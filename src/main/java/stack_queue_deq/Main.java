package stack_queue_deq;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//
//        System.out.println(stack.peek());
//        for (int i = 0; i < 4; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression expression = new Expression("( 4-( 5+{ i*p } ) )");
//        System.out.println(expression.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>(5);
//        System.out.println(queue);
//        queue.insert(5);
//        System.out.println(queue);
//        queue.insert(3);
//        System.out.println(queue);
//        queue.insert(2);
//
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue);
//        queue.insert(2);
//        System.out.println(queue);
//        queue.insert(2);
//        System.out.println(queue);
//        queue.insert(2);
//
//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>(Comparator.reverseOrder());
//        mpq.insert(5);
//        mpq.insert(2);
//        mpq.insert(15);
//        mpq.insert(3);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(mpq.remove());
//        }

        MyDequeue<Integer> deq = new MyDequeue<>(5);
        deq.pushBack(5);
        deq.pushBack(3);
        deq.pushBack(2);
        deq.pushFront(7);
        deq.pushFront(4);
//        deq.addLast(6);
//        deq.addFirst(8);
        System.out.println("first: " + deq.peekLeft() + " last: " + deq.peekRight());
        System.out.println(deq.size());
        System.out.println();
        for (int i = 0; i < deq.size(); i++) {
            System.out.println(deq.popBack());
        }

        ReverseReading rr = new ReverseReading();
        rr.readReverseText("Hello how are you? Would you like to a coding a little today?");

    }
}
