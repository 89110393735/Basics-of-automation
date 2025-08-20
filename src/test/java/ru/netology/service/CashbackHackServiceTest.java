package ru.netology.service;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int actual = service.remain(amout);
        int expected = 100;
        assertEquals(expected, actual);
    }
}