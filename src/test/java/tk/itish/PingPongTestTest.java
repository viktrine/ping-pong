package tk.itish;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class PingPongTestTest {
    // test the first count
    @Test
    void runPingPong_countUptoOne_ArrayList(){
        PingPongTest pingPongTest = new PingPongTest();
        List<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        assertEquals(expectedOutPut, pingPongTest.runPingPong(1));
    }

    // test the first n numbers
    @Test
    void runPingPong_countUptoTwo_ArrayList(){
        PingPongTest pingPongTest = new PingPongTest();
        List<Object> expectedOutPut = new ArrayList<>();
        expectedOutPut.add(1);
        expectedOutPut.add(2);
        assertEquals(expectedOutPut, pingPongTest.runPingPong(2));
    }
}