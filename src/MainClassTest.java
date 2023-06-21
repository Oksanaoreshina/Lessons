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
    public void testGetClassString()
    {

        String actual = mainClass.getClassString();


        Assert.assertTrue("Should be returned hello or Hello! ", actual.contains("Hello") || actual.contains("hello"));

    }
}