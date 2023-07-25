package tk.itish;

import java.util.ArrayList;
import java.util.List;

// define a class
public class PingPongTest {
    public List<Object> runPingPong(int countUpTo) {
        List<Object> results = new ArrayList<>();

        // loop through given numbers
        for(int i = 1; i <= countUpTo; i++){
            if(i % 3  == 0 && i % 5 == 0){
                results.add("pingpong");
            }else if(i % 3 == 0){
                results.add("ping");
            } else if (i % 5 == 0) {
                results.add("pong");
            } else{
                results.add(i);
            }
        }
        return results;
    }
}
