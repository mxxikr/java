import java.util.InputMismatchException;
import java.util.Scanner;

public class decimal_num_to_binary_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("다른 진수로 변환할 10진수 숫자와 변환할 진수를 입력하세요 : ");
            int x = scanner.nextInt();
            int r = scanner.nextInt();

            String remain = "";
            StringBuilder result = new StringBuilder();

            while (x != 0) {
                remain = String.valueOf(x % r);
                if (r == 16 && Integer.valueOf(remain) > 9) {
                    switch (Integer.valueOf(remain)) {
                        case 10:
                            remain = "A";
                            break;
                        case 11:
                            remain = "B";
                            break;
                        case 12:
                            remain = "C";
                            break;
                        case 13:
                            remain = "D";
                            break;
                        case 14:
                            remain = "E";
                            break;
                        case 15:
                            remain = "F";
                            break;
                    }
                }
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