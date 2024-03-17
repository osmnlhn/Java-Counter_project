import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
   Counter counter;
    @BeforeEach
    void setUp() {
        this.counter= new Counter();
    }

    @Test
    void increment() {
        assertTrue(this.counter.increment()==1);
        assertTrue(this.counter.increment()==2);

        this.counter.increment();
        this.counter.increment();

        assertFalse(this.counter.getCount()==2,"Should not return 2 after calling");
        assertEquals(4,this.counter.getCount());
        assertNotEquals(3,this.counter.increment());
    }

    @Test
    void decremant() {
        assertEquals(-1,this.counter.decremant());
        assertTrue(this.counter.decremant()==-2);
        this.counter.decremant();
        assertFalse(this.counter.getCount()==-2,"should not return -2 after calling");
        assertTrue(this.counter.getCount()==-3);
    }
}