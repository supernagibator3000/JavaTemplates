import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = new MyExecutorService(1);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService.submit(() -> System.out.println("Start"));

        ExecutorService executorService1 = new MyExecutorService(3);
        executorService1.submit(() -> {
            try { Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        executorService1.submit(() -> System.out.println("Start"));
    }
}
