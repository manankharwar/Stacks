package queues;
import java.util.*;

public class Queue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void enQueue(int element){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(element);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(s1.isEmpty()) {
            System.out.println("Queue is empty :(");
            System.exit(0);
        }

        return s1.pop();
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
