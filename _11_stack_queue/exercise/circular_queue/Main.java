package _11_stack_queue.circular_queue;

public class Main {
    public static void main(String[] args) {
        MyQueue.Queue queue = new MyQueue.Queue();
        queue.front = queue.rear = null;

        MyQueue.enQueue(queue, 5);
        MyQueue.enQueue(queue, 10);
        MyQueue.enQueue(queue, 25);

        MyQueue.displayQueue(queue);

        System.out.print("\nDelete value: " + MyQueue.deQueue(queue));
        System.out.print("\nDelete value: " + MyQueue.deQueue(queue)+"\n");

        MyQueue.displayQueue(queue);

        MyQueue.enQueue(queue, 30);
        MyQueue.enQueue(queue, 35);

        System.out.println();
        MyQueue.displayQueue(queue);
    }
}
