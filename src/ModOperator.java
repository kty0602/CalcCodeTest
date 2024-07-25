public class ModOperator implements Calc{
    @Override
    public double operate(double a, double b) {
        return a%b;
    }
}
