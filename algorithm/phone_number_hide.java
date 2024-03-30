/* 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

s는 길이 4 이상, 20이하인 문자열입니다. */

public class phone_number_hide {
    public String solution(String phone_number){
        int check = phone_number.length(); //11
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<check-4; i++) {
            sb.append("*");
            }
        String answer = phone_number.substring(check-4,check);
        sb.append(answer);
        return sb.toString();
        }
    public static void main(String[] args) {
        String phone_number = "01033334444";
        phone_number_hide sol = new phone_number_hide();
        System.out.println(sol.solution(phone_number));
    }
}
