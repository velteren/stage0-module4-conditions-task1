package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        boolean result = false;
        if (numberToBeDetermined > 0) result = true;
        System.out.println(result);
    }
}
