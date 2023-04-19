package week_by_week.week04.methodReferences;

public class StaticMethodReference {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                printMessage();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(()->printMessage() );
        thread2.start();

        Thread thread3 = new Thread(StaticMethodReference::printMessage);
        thread3.start();
    }

    private static void printMessage() {
        System.out.println("Hello!");
    }
}
