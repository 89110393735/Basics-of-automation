package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNG {
    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1000;
        int actual = service.remain(amout);
        int expected = 10;
        assertEquals(expected, actual);
    }
}
