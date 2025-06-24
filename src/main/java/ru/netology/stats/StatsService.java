package ru.netology.stats;

public class StatsService {

    public long totalSale(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageSale(long[] sales) {
       return totalSale(sales)/12;
    }

    public int monthMaximumSale (long[] sales) {
        int monthMaximum = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximum]) { // значит, в рассматриваемом i-м месяце продаж больше
                monthMaximum = i; // запомним его как максимальный
            }
        }

        return monthMaximum + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthMinimumSale (long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimum]) {
                monthMinimum = i;
            }
        }

        return monthMinimum + 1;
    }

    public int monthBellowAverage (long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage (long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }


}
