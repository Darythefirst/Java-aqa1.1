package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRemainLow(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100,service.remain(900));
    }

    @org.junit.Test
    public void testRemainHigh(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(450,service.remain(1550));
    }

    @org.junit.Test
    public void testRemainEquals(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0,service.remain(1000));
    }

    @org.junit.Test
    public void testRemainZero(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000,service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void testRemainLow2(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100,service.remain(900));
    }

    @org.junit.jupiter.api.Test
    public void testRemainHigh2(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(450,service.remain(1550));
    }

    @org.junit.jupiter.api.Test
    public void testRemainEquals2(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0,service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void testRemainZero2(){
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000,service.remain(0));
    }

}
