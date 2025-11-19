class MyRunnable implements Runnable {
    private String name;

    MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - iteration " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("RunnableThread1"));
        Thread t2 = new Thread(new MyRunnable("RunnableThread2"));

        t1.start();
        t2.start();
    }
}
