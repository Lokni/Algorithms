package stack_queue_deq;

public class ReverseReading {
   private char [] array;

    public void readReverseText(String text){
        array = new char[text.length()];
        array = text.toCharArray();
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }
}
