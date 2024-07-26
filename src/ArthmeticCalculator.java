import java.util.ArrayList;

public class ArthmeticCalculator extends Calculator {
    AddOperator add = new AddOperator();
    SubtractOperator sub = new SubtractOperator();
    MultiplyOperator mul = new MultiplyOperator();
    DivideOperator div = new DivideOperator();
    ModOperator mod = new ModOperator();

    @Override
    public double calculate(double a, double b, char c) throws ZeroException, WrongSymbolException {
        double result = 0;
        switch (c) {
            case '+':
                result = add.operate(a,b);
                break;
            case '-':
                result = sub.operate(a,b);
                break;
            case '*':
                result = mul.operate(a,b);
                break;
            case '/':
                if (b == 0) {
                    throw new ZeroException();
                }
                result = div.operate(a,b);
                break;
            case '%':
                result = mod.operate(a,b);
                break;
            default:
                throw new WrongSymbolException();
        }
        getList().add(result);
        return result;
    }
}


