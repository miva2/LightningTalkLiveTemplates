import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

import com.sun.tools.javac.util.List;

public class SomeDefaultExamples {


    // TODO make main method

    void loopThroughList(){

        final List<String> list = List.of("a", "b", "c");

        //TODO: list.for to generate a for loop

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


        // lock this code
        int a = 2 + 3;
        int b = a * 6;


    }

    //TODO: make a new method and show some surround live templates


    //TODO: Show how Live Templates look like!
    // go to Preferences (⌘,) > Editor > Live Templates


}