package concurrency;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 17.04.12
 * Time: 10:56
 * To change this template use File | Settings | File Templates.
 */
public class SimpleThreading {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.start();

        for(int i = 0; i < 1000; i++) {
            System.out.print("a");
        }
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.print("b");
        }
    }
}
