package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainAnderAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 999;

        int actual = hackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int actual = hackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainOverAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1001;

        int actual = hackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}