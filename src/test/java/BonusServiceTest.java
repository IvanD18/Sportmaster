import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonusStandart() {
        BonusService service = new BonusService();
        int result = service.calculateBonus(5, 1000);
        assertEquals(50, result);
    }

    @Test
    void calculateBonusSilver() {
        BonusService service = new BonusService();
        int result = service.calculateBonus(15001, 1000);
        assertEquals(70, result);
    }

    @Test
    void calculateBonusGolden() {
        BonusService service = new BonusService();
        int result = service.calculateBonus(150_001, 1000);
        assertEquals(100, result);
    }

    @Test
    void calculateBonusZero() {
        BonusService service = new BonusService();
        int result = service.calculateBonus(0, 1000);
        assertEquals(0, result);
    }
}