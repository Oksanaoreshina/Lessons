import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class MainClassTest  {
    MainClass mainClass;

    @Before
    public void setUp() throws Exception {
        mainClass = new MainClass();
    }


    @Test
    public void testGetLocalNumber()
    {

        int actual = mainClass.getLocalNumber();


        Assert.assertTrue("Should be returned 14", actual == 14);

    }
}