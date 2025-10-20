package Modul1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void Scenario1() {
        assertEquals(3, Task4.findMin(1,2,3));
    }

    @Test
    void Scenario2(){
        assertEquals(-1, Task4.findMin(-1,-2,-3));
    }

    @Test
    void Scenario3(){
        assertEquals(0, Task4.findMin(0,0,1));
    }
}