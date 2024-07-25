import java.util.*;
public class Calculator {
    private ArrayList<Float> list = new ArrayList<>();

    public ArrayList<Float> getList() {
        return list;
    }
    public void setList(ArrayList<Float> list) {
        this.list = list;
    }

    public float calculate(int a, int b, char c) throws ZeroException, WrongSymbolException {
        float result = 0;
        switch (c) {
            case '+':
                result = a+b;
                list.add(result);
                break;
            case '-':
                result = a-b;
                list.add(result);
                break;
            case '*':
                result = a*b;
                list.add(result);
                break;
            case '/':
                if (b == 0) {
                    throw new ZeroException();
                }
                result = a/b;
                list.add(result);
                break;
            default :
                throw new WrongSymbolException();
        }
        return result;
    }
}

class ZeroException extends Exception {
    public ZeroException() {
        super("분모에 0이 들어갈 수 없습니다!");
    }
}

class WrongSymbolException extends Exception {
    public WrongSymbolException() {
        super("추가되지 않거나 잘못된 연산기호를 입력하였습니다.");
    }
}
