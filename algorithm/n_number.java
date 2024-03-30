/*
함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
*/
import java.util.*;

public class n_number {
    public long[] solution(long x, int n) {
        long[] number_array = new long[n];
        
        Long start = x;
        
        for (int i=0; i<n; i++){
            number_array[i] = start;
            start += x;
        }
        return number_array;
    }
    public static void main(String[] args) {  
        n_number Solution = new n_number();
        long[] result = Solution.solution(-4, 2);
        System.out.println(Arrays.toString(result));
    }
}
