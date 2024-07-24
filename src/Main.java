import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] array = new float[10];
        float result = 0;
        int count = 0;

        while(true) {
            // count가 10 도달 시 값을 앞으로 옮기기
            if(count == array.length) {
                for (int i = 0; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                // count 1 내려서 array[9]에 저장
                count--;
            }

            System.out.print("첫번째 숫자를 입력해주세요. : ");
            int a = sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요. : ");
            int b = sc.nextInt();
            sc.nextLine(); // 버퍼에 남아 있는 줄 바꿈 문자 소비
            System.out.println("[+,-,*,/]");
            System.out.print("연산 기호를 입력해주세요. : ");
            char c = sc.next().charAt(0);

            switch (c) {
                case '+':
                    result = a+b;
                    System.out.println("답은 : "+result);
                    array[count] = result;
                    count++;
                    break;
                case '-':
                    result = a-b;
                    System.out.println("답은 : "+result);
                    array[count] = result;
                    count++;
                    break;
                case '*':
                    result = a*b;
                    System.out.println("답은 : "+result);
                    array[count] = result;
                    count++;
                    break;
                case '/':
                    result = a/b;
                    System.out.println("답은 : "+result);
                    array[count] = result;
                    count++;
                    break;
                default :
                    System.out.println("아직 미개발 연산 기호입니다.");
            }
            sc.nextLine(); // 결과 나온거 버퍼에 남아 있는 줄 바꿈 문자 소비
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String symbol = sc.nextLine();
            if(symbol.equals("exit")) {
                System.out.println("프로그램이 종료됩니다.");

                // 배열 내부 확인용
                for(int i = 0; i< array.length; i++) {
                    System.out.println((i+1)+"결과 : "+array[i]);
                }

                break;
            }
        }
    }
}
