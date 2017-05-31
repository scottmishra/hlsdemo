package hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * For Demo'ing Docker with Testing
 * Created by scott on 5/30/2017.
 */

public class  SampleControllerTest {
    @Before
    public void setUp() {
        System.out.println("Setting up the Test");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down the Test");
    }

    @Test
    public void homeShouldReturnHelloWorld() {
        SampleController controller = new SampleController();
        String results = controller.home();
        String expected = "Hello Docker World!";
        Assert.assertEquals(expected,results);
    }

    @Test
    public void valueShouldReturnDouble() {
        SampleController controller = new SampleController();
        Double results = controller.value();
        Assert.assertTrue(results instanceof Double);
    }


}