package tk.itish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// class for tests on LeapYear class
class LeapYearTest {
    // test if divisible by 4
    @Test
    void isLeapYear_whenYearDivisibleBy4_true(){
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.isLeapYear(2012));
    }

    // test if  divisible by 100
    @Test
    void isLeapYear_whenYearDivisibleBy100_true(){
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeapYear(2012));
    }
}