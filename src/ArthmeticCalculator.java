import java.util.ArrayList;

public class ArthmeticCalculator extends Calculator {

    @Override
    public double calculate(double a, double b, char c) throws ZeroException, WrongSymbolException {
        double result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new ZeroException();
                }
                result = a / b;
                break;
            default:
                throw new WrongSymbolException();
        }
        list.add(result);
        return result;
    }

    // 삭제 메서드
    @Override
    public void removeResult() {
        list.remove(0);
    }

    // 조회 메서드
    @Override
    public ArrayList<Double> inquiryResults() {
        return getList();
    }
}


