import Exception.*;

public class ArthmeticCalculator extends Calculator {

    // 객체를 인자로 받아 operator 필드에 저장
    // 예를 들어 '+' 연산 기호가 들어오면 switch문을 통해 AddOperator 객체를 주입
    // 다만 이 방법은 연산기호를 추가할 때마다 switch문에서 case를 증가시켜야 하는데
    // 이러한 점이 ocp를 지켰는지에 대해서는 아니라고 판단할 것 같다.
    private Calc operator;

    // setter를 통해 객체 주입
    public void setOperator(Calc operator) {
        this.operator = operator;
    }

    public ArthmeticCalculator() {
    }

    @Override
    public double calculate(double a, double b, char c) throws ZeroException, WrongSymbolException {
        OperatorType operatorType;

        // 매개변수 c값을 enum클래스로 넘겨 값을 비교시켜 연산 상수값 반환시킴
        operatorType = OperatorType.operatorType(c);

        double result = 0;
        // 반환받은 operatorType에 따라 switch문으로 operator에 해당 연산 처리를 위한 객체를 주입
        switch (operatorType) {
            case ADD:
                setOperator(new AddOperator());
                result = operator.operate(a,b);
                break;
            case SUBTRACT:
                setOperator(new SubtractOperator());
                result = operator.operate(a,b);
                break;
            case MULTIPLY:
                setOperator(new MultiplyOperator());
                result = operator.operate(a,b);
                break;
            case DIVIDE:
                if (b == 0) {
                    throw new ZeroException();
                }
                setOperator(new DivideOperator());
                result = operator.operate(a,b);
                break;
            case MOD:
                setOperator(new ModOperator());
                result = operator.operate(a,b);
                break;
            default:
                throw new WrongSymbolException();
        }
        getList().add(result);
        return result;
    }
}