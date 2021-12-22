package javaeight;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class CollectionsReview {


    public static void main(String[] args) {
        //first in first out
        queueExample();
        //last in first out
        stackExample();
        //no duplicates, no guaranteed order
        setExample();
    }

    private static void setExample() {

        Set<String> noRepeat = new HashSet<>();
        noRepeat.add("carlinhos");


    }

    private static void stackExample() {
        Stack<String> pilhaDeTazo = new Stack<>();
        pilhaDeTazo.add("tazo pokemon");
        pilhaDeTazo.add("tazo digimon");
        pilhaDeTazo.add("tazo losermon");

        System.out.println(pilhaDeTazo.pop());
        System.out.println(pilhaDeTazo.peek());
        System.out.println(pilhaDeTazo.pop());
    }

    private static void queueExample() {
        // queues are arrays with fifo ordering
        Queue<String> namesQueue = new LinkedList<>();
        namesQueue.add("James");
        namesQueue.add("zappa");
        namesQueue.add("alisson");
        System.out.println(namesQueue.poll() + "was removed from the queue");
        System.out.println(namesQueue.peek() + "was not removed thou");

    }

}
