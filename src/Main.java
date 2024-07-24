import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> list = new ArrayList<Float>();

        while(true) {
            float result = 0;
            System.out.print("첫번째 숫자를 입력해주세요. : ");
            int a = sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요. : ");
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("[+,-,*,/]");
            System.out.print("연산 기호를 입력해주세요. : ");
            char c = sc.next().charAt(0);

            switch (c) {
                case '+':
                    result = a+b;
                    System.out.println("답은 : "+result);
                    list.add(result);
                    break;
                case '-':
                    result = a-b;
                    System.out.println("답은 : "+result);
                    list.add(result);
                    break;
                case '*':
                    result = a*b;
                    System.out.println("답은 : "+result);
                    list.add(result);
                    break;
                case '/':
                    result = a/b;
                    System.out.println("답은 : "+result);
                    list.add(result);
                    break;
                default :
                    System.out.println("아직 미개발 연산 기호입니다.");
            }
            sc.nextLine();
            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.nextLine();
            if (remove.equals("remove")) {
                list.remove(0);
                System.out.println("삭제되었습니다.");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String symbol = sc.nextLine();
            if(symbol.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");
                // 확인용
                System.out.println(list);
                break;
            }
        }
    }
}
