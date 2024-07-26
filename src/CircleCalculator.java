import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    @Override
    public double calculateCircleArea(double r) {
        double result = 0;
        result = r*r*pi;
        getList().add(result);
        return result;
    }
}
