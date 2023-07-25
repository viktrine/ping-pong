package tk.itish;

import java.util.ArrayList;
import java.util.List;

// define a class
public class PingPongTest {
    public List<Object> runPingPong(int countUpTo) {
        List<Object> results = new ArrayList<>();

        // loop through given numbers
        for(int i = 1; i <= countUpTo; i++){
            results.add(i);
        }
        return results;
    }
}
