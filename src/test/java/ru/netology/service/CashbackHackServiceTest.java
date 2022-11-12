package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void amountLess1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 200;
        int actual = service.remain(800);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void amountMore1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 900;
        int actual = service.remain(1100);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void amount1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}
