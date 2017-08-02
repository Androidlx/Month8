package com.example.lixin.month8;

import android.test.AndroidTestCase;

/**
 * Created by hua on 2017/8/1.
 */

public class Test extends AndroidTestCase {

        public void test()throws Exception{

            TestAddClass testAddClass = new TestAddClass();
            int result = testAddClass.add(2, 2);
            assertTrue(4==result);


        }
}
