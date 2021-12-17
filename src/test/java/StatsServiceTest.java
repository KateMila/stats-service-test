import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 180;
            long actual = service.sumSales(sales);
       assertEquals(expected,actual);
    }
    @Test
    public void shouldCalculateAverageSale() {
        StatsService service= new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15;
        float actual =service.averageSale(sales);
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateMaxSales() {
        StatsService service= new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual =service.maxSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateMinSales() {
        StatsService service= new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual =service.minSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateLowSalesMonthCount() {
        StatsService service= new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual =service.lowSalesMonthCount(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldCalculateHighSalesMonthCount() {
        StatsService service= new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual =service.highSalesMonthCount(sales);
        assertEquals(expected,actual);
    }
}