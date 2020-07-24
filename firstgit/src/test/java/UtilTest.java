//package java;

import junit.framework.Assert;

import org.junit.Test;
/**
 * Created by zhangwanying6 on 2020/7/24.
 */
public class UtilTest {
    /**

     * 单元测试，对Util的countCharacter进行测试*/

    @Test
    public void testCountCharacter(){

        String string= "计科164-09-lollipop";

        char character = '-';

        int countExpect = 2;

        int count = Util.countCharacter(string,character);

        Assert.assertEquals(countExpect,count);

    }
}
