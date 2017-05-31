package hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Created by scott on 5/31/2017.
 */
public class SubclassTest extends SampleControllerTest {
    @Before
    public void SetUp(){
        System.out.println("New SetUp");
    }

    @After
    public void TearDown(){
        System.out.println("New Tear Down");
    }

    @Test
    public void TestThis(){
        Assert.assertTrue(true);
    }
}
