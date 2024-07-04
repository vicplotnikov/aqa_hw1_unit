package ru.netology.services;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals( actual, expected );
    }

    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        assertEquals( actual, expected );
    }

    @org.testng.annotations.Test
    public void testRemainWithCashbackMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals( actual, expected );
    }

}
