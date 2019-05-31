import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import com.sun.tools.javac.util.List;

public class SomeDefaultExamples {


    // TODO make main method
    //  psvm
    public static void main(String[] args) {

    }


    void loopThroughList(){

        final List<String> list = List.of("a", "b", "c");

        //TODO: list.for to generate a for loop
        for (final String stringwhatever : list) {

        }
    }

    void lockAwayThisCode() {

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
        //  select, cmd + alt + t, r
        // The generated code automatically uses the correct declared variable
        lockylock.readLock().lock();
        try {
            int a = 2 + 3;
            int b = a * 6;
        } finally {
            lockylock.readLock().unlock();
        }


    }

    //TODO: make a new method and show some surround live templates
    void methodenaam(){

    }

    //TODO: Show how Live Templates look like!
    // go to Preferences (⌘,) > Editor > Live Templates


}