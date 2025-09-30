package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void sumAllSales() {
        StatsService service = new StatsService();

        long[] param = {5000000000L, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.sumAllSales(param);
        long expectedSum = 5000000172L;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void midSumSales() {
        StatsService service = new StatsService();

        long[] param = {5000000000L, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.midSumSales(param);
        long expectedSum = 416666681L;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();

        long[] param = {5000000000L, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.maxSales(param);
        int expectedSum = 1;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();

        long[] param = {5000000000L, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.minSales(param);
        int expectedSum = 9;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void belowMidSales() {
        StatsService service = new StatsService();
        long[] param = {5000000000L, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.belowMidSales(param);
        int expectedSum = 11;

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void aboveMidSales() {
        StatsService service = new StatsService();

        long[] param = new long[]{5000000000L, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualSum = service.aboveMidSales(param);
        int expectedSum = 1;

        Assertions.assertEquals(expectedSum, actualSum);
    }

}
