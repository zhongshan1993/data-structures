import java.util.Random;

public class Main {
    private static double testQueue(Queue<Integer> q, int optCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < optCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < optCount; i++) {
            q.dequeue();
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {
	    // write your code here
        int optCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue, optCount);
        System.out.println("ArrayQueue, time: " + time1 + " s");

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue, optCount);
        System.out.println("LoopQueue, time: " + time2 + " s");
    }
}
