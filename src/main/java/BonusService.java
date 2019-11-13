public class BonusService {

    private int standardLevel(int currentValue) {
        int bonus = 50;
        int calculationUnit = 1000;
        return currentValue / calculationUnit * bonus;
    }

    private int silverLevel(int currentValue) {
        int bonus = 70;
        int calculationUnit = 1000;
        return currentValue / calculationUnit * bonus;
    }

    private int goldenLevel(int currentValue) {
        int bonus = 100;
        int calculationUnit = 1000;
        return currentValue / calculationUnit * bonus;
    }

    public int calculateBonus(int accumulation, int currentValue) {
        int lower = 1;
        int mid = 15_000;
        int top = 150_000;
        if (accumulation <= mid && accumulation > lower) {
            return standardLevel(currentValue);
        }
        if (accumulation > mid && accumulation <= top) {
            return silverLevel(currentValue);
        }
        if (accumulation > top) {
            return goldenLevel(currentValue);
        }
        return 0;

    }

}
