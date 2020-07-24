//package java;
import junit.framework.Test;

import junit.framework.TestCase;

import junit.framework.TestSuite;
/**
 * Created by zhangwanying6 on 2020/7/24.
 */
public class mainTest extends TestCase{
    public mainTest( String testName )
    {
        super( testName );
    }



    /**

     * @return the suite of tests being tested

     */

    public static Test suite()

    {

        return new TestSuite( mainTest.class );

    }



    /**

     * Rigourous Test :-)

     */

    public void testApp()

    {

        assertTrue( true );

    }
}
