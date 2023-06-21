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
    public void testGetClassNumber()
    {

        int actual = mainClass.getClassNumber();


        Assert.assertTrue("Should be > 45!", actual > 45);

    }
}