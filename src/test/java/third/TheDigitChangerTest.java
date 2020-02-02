package third;

import org.junit.Assert;
import org.junit.Test;

public class TheDigitChangerTest {
    TheDigitChanger theDigitChanger = new TheDigitChanger();

    //7 -> 0111 => should be returned 1111 = 15
    @Test
    public void shouldReturnFifteenIfSeven(){
        Assert.assertEquals(theDigitChanger.changeTheMostRightDigitFromZeroToOne(7), 15);
    }

    //11 -> 1011 => should be returned 1111 = 15
    @Test
    public void shouldReturnFifteenIfEleven(){
        Assert.assertEquals(theDigitChanger.changeTheMostRightDigitFromZeroToOne(11), 15);
    }

    //6 -> 110 => should be returned 111 = 7
    @Test
    public void shouldReturnSevenIfSix(){
        Assert.assertEquals(theDigitChanger.changeTheMostRightDigitFromZeroToOne(6), 7);
    }

}
