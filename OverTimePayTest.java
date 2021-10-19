package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OverTimePayTest {
    @Test
    public void testcase1() {
        Assert.assertEquals("$0.0" , OverTimePay.calculateOverTimePay(0.0, 0.0, 30, 1.5) );
    }
    @Test
    public void testcase2() {
        Assert.assertEquals("$405.0" ,  OverTimePay.calculateOverTimePay(0.0, 9.0, 30, 1.5) );
    }
    @Test
    public void testcase3() {
        Assert.assertEquals("$240.0" ,  OverTimePay.calculateOverTimePay(9.0, 17.0, 30, 1.5) );
    }
    @Test
    public void testcase4() {
        Assert.assertEquals("$960.0" ,  OverTimePay.calculateOverTimePay(0.0, 24.0, 30, 1.5) );
    }
    @Test
    public void testcase5() {
        Assert.assertEquals("$555.0" ,  OverTimePay.calculateOverTimePay(9.0, 24.0, 30, 1.5) );
    }
    @Test
    public void testcase6() {
        Assert.assertEquals("$315.0" ,  OverTimePay.calculateOverTimePay(17.0, 24.0, 30, 1.5) );
    }
    @Test
    public void testcase7() {
        Assert.assertEquals("$0.0" ,  OverTimePay.calculateOverTimePay(24.0, 24.0, 30, 1.5) );
    }
    @Test
    public void testcase8() {
        Assert.assertEquals("Travelling in time machine!!" ,  OverTimePay.calculateOverTimePay(24.0, 0.0, 30, 1.5) );
    }

}