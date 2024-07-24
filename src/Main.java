
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요. : ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요. : ");
        int b = sc.nextInt();
        sc.nextLine(); // 버퍼에 남아 있는 줄 바꿈 문자 소비
        System.out.println("[+,-,*,/]");
        System.out.print("연산 기호를 입력해주세요. : ");
        char c = sc.next().charAt(0);

    }
}
