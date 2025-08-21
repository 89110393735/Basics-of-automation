package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNG {
    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int actual = service.remain(amout);
        int expected = 100;
        assertEquals(actual, expected );
    }
}
