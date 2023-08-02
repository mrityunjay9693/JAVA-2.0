package local.tilde;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void souldReturnHelloWorld()
    {
        //assertTrue( true );
        assertEquals("Hello World Test Passed","Hello World", App.helloWorld());
    }
    @Test
    public void shouldReturnDataCreated()
    {
        assertEquals("Data Created Test Passed", "Data Created!", App.create());
    }

}



