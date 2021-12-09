package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMain {
    @Test
    public void getGreeting() {
        String test = Main.greeting();
        String expected = "Hello World";
        Assert.assertEquals(expected, test);
    }
}
