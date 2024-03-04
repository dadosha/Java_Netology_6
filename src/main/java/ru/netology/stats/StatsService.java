package ru.netology.stats;

public class StatsService {
    public int allAmount(int[] sales) {
        int allAmount = 0;

        for (int sale : sales) {
            allAmount = allAmount + sale;
        }

        System.out.println("Суммарные продажи - " + allAmount);

        return allAmount;
    }

    public int averageAmount(int[] sales) {
        int allAmount = allAmount(sales);
        int monthCount = sales.length;

        System.out.println("Средние продажи - " + (allAmount / monthCount));

        return allAmount / monthCount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }

        System.out.println("Максимальные продажи - " + maxMonth);

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }

        System.out.println("Минимальные продажи - " + minMonth);

        return minMonth + 1;
    }

    public int lessAvergeMonth(int[] sales) {
        int averageAmount = averageAmount(sales);
        int monthCount = 0;

        for (int i : sales) {
            if (i < averageAmount) {
                monthCount++;
            }
        }

        System.out.println("Количество месяцев, в которых продажи были ниже среднего - " + monthCount);

        return monthCount;
    }

    public int moreAvergeMonth(int[] sales) {
        int averageAmount = averageAmount(sales);
        int monthCount = 0;

        for (int i : sales) {
            if (i > averageAmount) {
                monthCount++;
            }
        }

        System.out.println("Количество месяцев, в которых продажи были выше среднего - " + monthCount);

        return monthCount;
    }
}
