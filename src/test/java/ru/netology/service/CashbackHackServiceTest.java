package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainAnderAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 999;

        int actual = hackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int actual = hackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainOverAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1001;

        int actual = hackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}