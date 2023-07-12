package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldRemainAnderAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 999;

        int actual = hackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1000;

        int actual = hackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldRemainOverAmountLimit() {
        CashbackHackService hackService = new CashbackHackService();
        int amount = 1001;

        int actual = hackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}