package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void sumAllSales() {
        StatsService service = new StatsService();

        int[] param = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.sumAllSales(param);
        int expectedSum = 180;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void midSumSales() {
        StatsService service = new StatsService();

        int[] param = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.midSumSales(param);
        int expectedSum = 15;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        int[] param = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.maxSales(param);
        int expectedSum = 8;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();

        int[] param = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.minSales(param);
        int expectedSum = 9;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void belowMidSales() {
        StatsService service = new StatsService();

        int[] param = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.belowMidSales(param);
        int expectedSum = 5;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void aboveMidSales() {
        StatsService service = new StatsService();

        int[] param = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.aboveMidSales(param);
        int expectedSum = 5;

        Assertions.assertEquals(expectedSum, actualSum);
    }

}
