package Exception;

public class WrongSymbolException extends Exception {
    public WrongSymbolException() {
        super("추가되지 않거나 잘못된 연산기호를 입력하였습니다.");
    }
}
