package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testAllAmount() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.allAmount(stats);

        Assertions.assertEquals(180, actual);
    }

    @Test
    public void testAverageAmount() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageAmount(stats);

        Assertions.assertEquals(15, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(stats);

        Assertions.assertEquals(9, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(stats);

        Assertions.assertEquals(8, actual);
    }

    @Test
    public void testLessAverageMonth() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.lessAvergeMonth(stats);

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testMoreAverageMonth() {
        StatsService service = new StatsService();

        int[] stats = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.moreAvergeMonth(stats);

        Assertions.assertEquals(5, actual);
    }
}
