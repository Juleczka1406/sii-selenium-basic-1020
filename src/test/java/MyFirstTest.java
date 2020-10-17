import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest extends BaseTest {
    @Test
    public void helloWorld() {
        System.out.println(">>>>>Hello world");
        Assert.assertEquals("asd","qwe");
        Assert.assertEquals(5,5);
    }

    @Test
    public void helloMateusz() {
        System.out.println(">>>>>Hello mateusz");
        boolean value = true;
        Assert.assertTrue(value);
    }
}