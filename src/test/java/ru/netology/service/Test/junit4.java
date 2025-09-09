package ru.netology.service.Test;

import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class junit4 {

    @Test
    public void calculateBonusTest() {
        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int actual = service.remain(amout);
        int expected = 100;
        assertEquals(actual, expected);
    }
}