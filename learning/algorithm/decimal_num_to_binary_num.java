import java.util.InputMismatchException;
import java.util.Scanner;

public class decimal_num_to_binary_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("다른 진수로 변환할 10진수 숫자와 변환할 진수를 입력하세요 : ");
            int x = scanner.nextInt();
            int r = scanner.nextInt();

            int remain = 0;
            StringBuilder result = new StringBuilder();

            while (x != 0) {
                remain = x % r;
                result.append(remain);
                x = x / r;
            }

            System.out.println("입력한 10진수의 정수 부분을 r진수로 변환 값은 %s 입니다.".formatted(result.reverse().toString()));
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("숫자를 다시 입력해주세요");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}