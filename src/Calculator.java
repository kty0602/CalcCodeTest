import java.util.*;
import Exception.*;

public abstract class Calculator {
    // 모든 인스턴스가 공유할 수 있고 절대 변하지 않는 원주율 값이기 때문에 static, final을 사용하였다.
    static final double pi = 3.14;

    private ArrayList<Double> list;

    public ArrayList<Double> getList() {
        return list;
    }

    // 컬렉션 타입 필드인데 Setter로 수정, 삽입을 할 수 없다고 판단
    // 요구사항으로 선언은 하지만, 실제로는 사용을 안할 것 같다.
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

    // 입력한 숫자보다 큰 숫자들 반환
    public void CheckNumber(double d) {
        // anyMatch를 사용하여 boolean값을 반환하도록 함
        // 입력한 숫자보다 큰 값이 없거나 하는 경우를 위해서 만듬
        boolean checkValue = getList().stream().anyMatch(list -> list > d);

        if(checkValue) {
            getList().stream().filter(list -> list > d)
                    .forEach(list -> System.out.println("큰 값 : " + list));
        } else {
            System.out.println("[현재 리스트가 비어있거나, 입력한 숫자보다 큰 값이 없습니다.]");
        }
    }

    // (공통)삭제 메서드
    public void removeResult() {
        list.remove(0);
    }

    // (공통)조회 메서드
    public ArrayList<Double> inquiryResults() {
        return getList();
    }

}
