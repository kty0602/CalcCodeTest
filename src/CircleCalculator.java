import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    @Override
    public double calculateCircleArea(double r) {
        double result = 0;
        result = r*r*pi;
        list.add(result);
        return result;
    }


    @Override
    public void removeResult() {
        list.remove(0);
    }

    @Override
    public ArrayList<Double> inquiryResults() {
        return getList();
    }
}
