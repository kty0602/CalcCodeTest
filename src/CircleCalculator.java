public class CircleCalculator<D extends Number> extends Calculator<D> {

    @Override
    public double calculateCircleArea(D r) {
        Double result;
        result = r.doubleValue()*r.doubleValue()*pi;
        getList().add((D) result);
        return result;
    }
}
