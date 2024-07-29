import Exception.*;

public class ArthmeticCalculator<D extends Number> extends Calculator<D> {
    //
    // 제네릭 참고 :
    // https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EC%A0%9C%EB%84%A4%EB%A6%ADGenerics-%EA%B0%9C%EB%85%90-%EB%AC%B8%EB%B2%95-%EC%A0%95%EB%B3%B5%ED%95%98%EA%B8%B0
    // 이것이 자바다 도서 참고

    // 객체를 인자로 받아 operator 필드에 저장
    // 예를 들어 '+' 연산 기호가 들어오면 switch문을 통해 AddOperator 객체를 주입
    // 다만 이 방법은 연산기호를 추가할 때마다 switch문에서 case를 증가시켜야 하는데
    // 이러한 점이 ocp를 지켰는지에 대해서는 아니라고 판단할 것 같다.
    private Calc<D> operator;

    // setter를 통해 객체 주입
    public void setOperator(Calc<D> operator) {
        this.operator = operator;
    }

    public ArthmeticCalculator() {
    }

    @Override
    public double calculate(D a, D b, char c) throws ZeroException, WrongSymbolException {
        OperatorType operatorType;

        // 매개변수 c값을 enum클래스로 넘겨 값을 비교시켜 연산 상수값 반환시킴
        operatorType = OperatorType.operatorType(c);

        D result;
        // 반환받은 operatorType에 따라 switch문으로 operator에 해당 연산 처리를 위한 객체를 주입
        switch (operatorType) {
            case ADD:
                // ADD 일 때, AddOperator 객체를 Calc<D>로 캐스팅하여 operator에 저장
                // 이후 operate(a,b) 메서드를 호출하여 결과를 계산
                setOperator((Calc<D>) new AddOperator());
                result = operator.operate(a, b);
                break;
            case SUBTRACT:
                setOperator((Calc<D>) new SubtractOperator());
                result = operator.operate(a,b);
                break;
            case MULTIPLY:
                setOperator((Calc<D>) new MultiplyOperator());
                result = operator.operate(a,b);
                break;
            case DIVIDE:
                // 제네릭 타입과 기본타입 간의 직접적인 비교 불가로 doubleValue()를 통해 형변환을 하고 비교
                if (b.doubleValue() == 0) {
                    throw new ZeroException();
                }
                setOperator((Calc<D>) new DivideOperator());
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
        return (double) result;
    }
}