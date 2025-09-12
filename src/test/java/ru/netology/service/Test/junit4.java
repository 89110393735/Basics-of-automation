package ru.netology.service.Test;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;


import static org.testng.AssertJUnit.assertEquals;


public class junit4 {

    @Test
    public void calculateBonus() {

        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int actual = service.remain(amout);
        int expected = 100;
        assertEquals(expected,actual );
    }
}