import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class main {

    // I created this main method by typing "psvm".
    // This is a Live Template provided by IntelliJ
    public static void main(String[] args) {

        ReadWriteLock lockylock = new ReadWriteLock() {
            public Lock readLock() {
                return null;
            }

            public Lock writeLock() {
                return null;
            }
        };

        String somestring = "blabla";


        // TODO: this code needs to be locked
        // TODO: select, cmd + alt + t, r
        // The generated code automatically uses the correct declared variable

        int a = 2 + 3;
        int b = a * 6;

    }
}
