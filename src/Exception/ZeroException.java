package Exception;

public class ZeroException extends Exception {
    public ZeroException() {
        super("분모에 0이 들어갈 수 없습니다!");
    }
}
