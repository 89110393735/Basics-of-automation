package ru.netology.service.Test;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;


import static org.testng.AssertJUnit.assertEquals;

public class TestNG {
    @Test
    public void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amout = 1000;
        int actual = service.remain(amout);
        int expected = 0;
        assertEquals(expected, actual);
    }
}
