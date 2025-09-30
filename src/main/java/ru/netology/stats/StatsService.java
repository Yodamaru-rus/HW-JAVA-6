package ru.netology.stats;


public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long midSumSales(long[] sales) {
        long midSum = 0;
        for (long sale : sales) {
            midSum += sale;
        }
        midSum = midSum / sales.length;
        return midSum;
    }

    public int maxSales(long[] sales) {
        long maxSales = 0;
        int numberMonth = 0;
        for (int t = 0; t < sales.length; t++) {
            if (maxSales <= sales[t]) {
                maxSales = sales[t];
                numberMonth = t + 1;
            }
        }
        return numberMonth;
    }

    public int minSales(long[] sales) {
        long maxSales = sales[0];
        int numberMonth = 0;
        for (int t = 0; t < sales.length; t++) {
            if (maxSales >= sales[t]) {
                maxSales = sales[t];
                numberMonth = t + 1;
            }
        }
        return numberMonth;
    }

    public int belowMidSales(long[] sales) {
        long midSum;
        int count = 0;
        midSum = midSumSales(sales);

        for (long sale : sales) {
            if (midSum > sale) {
                count++;
            }
        }
        return count;
    }

    public int aboveMidSales(long[] sales) {
        long midSum;
        int count = 0;
        midSum = midSumSales(sales);

        for (long sale : sales) {
            if (midSum < sale) {
                count++;
            }
        }
        return count;
    }

}
