import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseStringWithnull(){
       Assert.assertNull(ReverseString.reverseString(null));



    }
    @Test
    public void reverseWithDigits(){
        Assert.assertEquals("asdasd", ReverseString.reverseString("aza"));
        System.out.println("reverseStringDigits pass");
    }



    @Test
    public void  reverseTestHappyPath(){
        Assert.assertEquals("ananab", ReverseString.reverseString("banana"));
        System.out.println("reverseStringHappyPath pass");
    }

}
