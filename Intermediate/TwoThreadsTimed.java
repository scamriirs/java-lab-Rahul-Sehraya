class TimedPrinter implements Runnable {
    private final String label;
    private final long intervalMillis;
    private final int repeats;

    TimedPrinter(String label, long intervalMillis, int repeats) {
        this.label = label;
        this.intervalMillis = intervalMillis;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeats; i++) {
            System.out.println(label + " (time: " + System.currentTimeMillis() + ")");
            try {
                Thread.sleep(intervalMillis);
            } catch (InterruptedException e) {
                System.out.println(label + " interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(label + " finished.");
    }
}

public class TwoThreadsTimed {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TimedPrinter("Thread1", 2000, 5)); 
        Thread thread2 = new Thread(new TimedPrinter("Thread2", 4000, 3)); 

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads completed.");
    }
}
