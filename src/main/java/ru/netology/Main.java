package ru.netology;

public class Main {
    public static void main(String[] args) {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] income = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long StatisticServices = service.currentMax(income);
        System.out.println("Что то посчиталось " + StatisticServices);
    }
}



