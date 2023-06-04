package com.csi.controller.test;

import com.csi.controller.ArithmeticApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArithemeticApplicationTest {

    ArithmeticApplication arithmeticApplication = new ArithmeticApplication();

    @Test
    public void addTest() {

        Assert.assertEquals(7, arithmeticApplication.add(4, 3));
    }

    @Test
    public void subTest() {
        Assert.assertEquals(7, arithmeticApplication.sub(10, 3));
    }

    @Test
    public void mulTest() {
        Assert.assertEquals(21, arithmeticApplication.mul(7, 3));
    }

    @Test
    public void divTest() {
        Assert.assertEquals(2, arithmeticApplication.div(100, 50));
    }
}
