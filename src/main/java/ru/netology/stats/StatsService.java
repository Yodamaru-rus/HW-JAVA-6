package ru.netology.stats;


public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int midSumSales(int[] sales) {
        int midSum = 0;
        for (int sale : sales) {
            midSum += sale;
        }
        midSum = midSum / sales.length;
        return midSum;
    }

    public int maxSales(int[] sales) {
        int maxSales = 0;
        int numberMonth = 0;
        for (int t = 0; t < sales.length; t++) {
            if (maxSales <= sales[t]) {
                maxSales = sales[t];
                numberMonth = t + 1;
            }
        }
        return numberMonth;
    }

    public int minSales(int[] sales) {
        int maxSales = sales[0];
        int numberMonth = 0;
        for (int t = 0; t < sales.length; t++) {
            if (maxSales >= sales[t]) {
                maxSales = sales[t];
                numberMonth = t + 1;
            }
        }
        return numberMonth;
    }

    public int belowMidSales(int[] sales) {
        int midSum;
        int count = 0;
        midSum = midSumSales(sales);

        for (int sale : sales) {
            if (midSum > sale) {
                count++;
            }
        }
        return count;
    }

    public int aboveMidSales(int[] sales) {
        int midSum;
        int count = 0;
        midSum = midSumSales(sales);

        for (int sale : sales) {
            if (midSum < sale) {
                count++;
            }
        }
        return count;
    }

}
