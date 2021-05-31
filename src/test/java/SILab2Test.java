import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 tmp = new SILab2();
    RuntimeException exception;


    @Test
    public void test1(){
        System.out.println("Multiple Conditions test");
        exception = assertThrows(RuntimeException.class, () -> tmp.function(Arrays.asList(new Time(0,0,0))));
        assertEquals("The hour are smaller than the minimum",exception.getMessage());

        exception = assertThrows(RuntimeException.class, () -> tmp.function(Arrays.asList(new Time(24,0,0))));
        assertEquals("The hours are grater than the maximum",exception.getMessage());
        


    }

    @Test
    public void test2(){
        SILab2 tmp = new SILab2();
        RuntimeException exception;


    }

}