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
                float result = cal.calculate(a, b, c);
                System.out.println("답은: " + result);
            } catch(Exception e){
                System.out.println("오류 : "+ e.getMessage());
            } finally {
                sc.nextLine();
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

