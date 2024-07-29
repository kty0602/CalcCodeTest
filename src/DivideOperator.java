public class DivideOperator<D extends Number> implements Calc<D> {
    @Override
    public D operate(D a, D b) {
        // 제네릭 D타입이 Number를 상속받고 있는데 Number클래스는 +를 지원하지 않음
        // 그리하여 각 숫자로 변환 후 연산을 진행해야 한다.
        // 새롭게 알게 된 것 : 제네릭 타입은 객체 타입만 참조할 수 있기에 double, int같은 원시 자료형은 사용이 불가능하다.
        Double result = a.doubleValue()/b.doubleValue();
        return (D) result;
    }
}
