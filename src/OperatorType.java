import Exception.WrongSymbolException;
public enum OperatorType {

    // 상수("연관시킬 문자") 로 선언, c가 들어오면 해당하는 상수를 리턴시킨다.
    // 참고 주소 : https://limkydev.tistory.com/66
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    MOD('%');

    private final char c;

    OperatorType(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    // 매개변수 c값을 enum클래스에서 '선언한 연관시킬 문자' 와 비교하여 해당 값을 반환
    public static OperatorType operatorType(char c) throws WrongSymbolException {
        for (OperatorType op : values()) {
            if (op.getC() == c) {
                return op;
            }
        }
        throw new WrongSymbolException();
    }
}
