import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
   Counter counter;
   //
    @BeforeEach
    void setUp() {
        this.counter= new Counter();
    }

    @Test
    void increment() {
        assertEquals(1, this.counter.increment());
        assertEquals(2, this.counter.increment());

        this.counter.increment();
        this.counter.increment();

        assertNotEquals(2, this.counter.getCount(), "Should not return 2 after calling");
        assertEquals(4,this.counter.getCount());
        assertNotEquals(3,this.counter.increment());
    }

    @Test
    void decremant() {
        assertEquals(-1,this.counter.decremant());
        assertEquals(-2, this.counter.decremant());
        this.counter.decremant();
        assertNotEquals(-2, this.counter.getCount(), "should not return -2 after calling");
        assertEquals(-3, this.counter.getCount());
    }
}