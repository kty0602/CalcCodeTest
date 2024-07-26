import java.util.*;
import Exception.*;

public abstract class Calculator {
    // 모든 인스턴스가 공유할 수 있고 절대 변하지 않는 원주율 값이기 때문에 static, final을 사용하였다.
    static final double pi = 3.14;

    private ArrayList<Double> list;

    public ArrayList<Double> getList() {
        return list;
    }
    public void setList(ArrayList<Double> list) {
        this.list = list;
    }

    public Calculator() {
        this.list = new ArrayList<>();
    }

    // 일반 계산
    public double calculate(double a, double b, char c) throws ZeroException, WrongSymbolException {
        return 0;
    };

    // 원 넓이 계산
    public double calculateCircleArea(double r) {
        return 0;
    };

    // (공통)삭제 메서드
    public void removeResult() {
        list.remove(0);
    }

    // (공통)조회 메서드
    public ArrayList<Double> inquiryResults() {
        return getList();
    }

}
