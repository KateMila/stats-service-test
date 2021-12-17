package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float averageSale(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (float) sum / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowSalesMonthCount(long[] sales) {
        float averageSale = averageSale(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int highSalesMonthCount(long[] sales) {
        float averageSale = averageSale(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}


