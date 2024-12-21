import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StatisticsServiceTest {
    @Test
    void findMax() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] incomesInBillions = {10, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
 @Test
void currentMax() {
    ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
    long[] income = {0};
    long expected = 0;
    long actual = service.currentMax(income);
    Assertions.assertEquals(expected, actual);
}
}