package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class junit4 {

    @Test
    public void calculateBonus() {
        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int actual = service.remain(amout);
        int expected = 100;
        assertEquals(actual, expected );
    }
}