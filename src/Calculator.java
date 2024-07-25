import java.util.*;
public class Calculator {
    private ArrayList<Float> list;
    private ArrayList<Double> CircleList;

    // 모든 인스턴스가 공유할 수 있고 절대 변하지 않는 원주율 값이기 때문에 static, final을 사용하였다.
    static final double pi = 3.14;

    public Calculator() {
        this.list = new ArrayList<>();
        this.CircleList = new ArrayList<>();
    }

    public ArrayList<Float> getList() {
        return list;
    }
    public void setList(ArrayList<Float> list) {
        this.list = list;
    }

    public ArrayList<Double> getCircleList() {
        return CircleList;
    }
    public void setCircleList(ArrayList<Double> CircleList) {
        this.CircleList = CircleList;
    }

    public void removeResult() {
        list.remove(0);
    }

    public ArrayList<Float> inquiryResults() {
        return getList();
    }

    public ArrayList<Double> circleResults() {
        return getCircleList();
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

    public double calculateCircleArea(double r) {
        double result = 0;
        result = r*r*pi;
        CircleList.add(result);
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
