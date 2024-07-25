import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArthmeticCalculator ar = new ArthmeticCalculator();
        CircleCalculator cr = new CircleCalculator();

        while(true) {
            try {
                System.out.print("[1. 계산기 / 2. 원 넓이 계산 (번호를 선택해 주세요.)]: ");
                int x = sc.nextInt();
                if(x == 1) {
                    System.out.print("[첫번째 숫자를 입력해주세요.] : ");
                    int a = sc.nextInt();
                    System.out.print("[두번째 숫자를 입력해주세요.] : ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println("[+,-,*,/]");
                    System.out.print("[연산 기호를 입력해주세요.] : ");
                    char c = sc.next().charAt(0);
                    double result = ar.calculate(a,b,c);
                    System.out.println("[답은] : " + result);
                    sc.nextLine();
                    System.out.print("[가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)] : ");
                    String remove = sc.nextLine();
                    if (remove.equals("remove")) {
                        ar.removeResult();
                        System.out.println("[삭제되었습니다.]");
                    }
                    System.out.print("[저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)] : ");
                    String inquiry = sc.nextLine();
                    if (inquiry.equals("inquiry")) {
                        System.out.println("[모든 계산 결과] : " + ar.inquiryResults());
                    }
                } else if(x == 2){
                    System.out.print("[반지름 길이를 입력해주세요.] : ");
                    double r = sc.nextInt();
                    sc.nextLine();
                    double result = cr.calculateCircleArea(r);
                    System.out.println("[답은] : " + result);
                    System.out.print("[가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)] : ");
                    String remove = sc.nextLine();
                    if (remove.equals("remove")) {
                        cr.removeResult();
                        System.out.println("[삭제되었습니다.]");
                    }
                    System.out.print("[저장된 연산결과를 조회하시겠습니까? (circle 입력 시 조회)] : ");
                    String circle = sc.nextLine();
                    if (circle.equals("circle")) {
                        System.out.println("[모든 계산 결과] : " + cr.inquiryResults());
                    }
                } else {
                    throw new Exception("잘못된 번호 값 입니다.");
                }
            } catch(Exception e) {
                System.out.println("오류 : "+ e.getMessage());
                sc.nextLine();
            } finally {
                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
                String symbol = sc.nextLine();
                if (symbol.equals("exit")) {
                    System.out.println("프로그램이 종료됩니다.");
                    break;
                }
            }
        }
    }
}

