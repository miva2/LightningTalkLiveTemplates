import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class main {

    // I created this main method by typing "psvm".
    // This is a Live Template provided by IntelliJ
    public static void main(String[] args) {

        ReadWriteLock lock = new ReadWriteLock() {
            public Lock readLock() {
                return null;
            }

            public Lock writeLock() {
                return null;
            }
        };

        String somestring = "blabla";


        lock.writeLock().lock();
        try {

            int a = 2 + 3;
            int b = a * 6;
        } finally {
            lock.writeLock().unlock();
        }


    }
}
