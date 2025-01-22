public class DaemonThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true); // Set as daemon thread
        thread.start();
        try {
            Thread.sleep(5000); // Main thread sleeps for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is exiting");
    }
}