import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while(true) {
            try {
                System.out.print("첫번째 숫자를 입력해주세요. : ");
                int a = sc.nextInt();
                System.out.print("두번째 숫자를 입력해주세요. : ");
                int b = sc.nextInt();
                sc.nextLine();
                System.out.println("[+,-,*,/]");
                System.out.print("연산 기호를 입력해주세요. : ");
                char c = sc.next().charAt(0);
                float result = cal.calculate(a,b,c);
                System.out.println("답은: " + result);
            } catch(Exception e) {
                System.out.println("오류 : "+ e.getMessage());
            } finally {
                sc.nextLine();
                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
                String remove = sc.nextLine();
                if (remove.equals("remove")) {
                    cal.removeResult();
                    System.out.println("삭제되었습니다.");
                }
                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                String inquiry = sc.nextLine();
                if (inquiry.equals("inquiry")) {
                    System.out.println("모든 계산 결과: " + cal.inquiryResults());
                }
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

