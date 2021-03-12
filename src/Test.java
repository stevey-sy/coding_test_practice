
// 코딩테스트 String 문제 1.
public class Test {

    public static void main (String[] args) {
        // 문제
        // Input : 1->2->3,
        //         8->8->8
        // Output: 1011
        // 문자열처럼 생긴 음이 아닌 정수 값 num1, num2
        // 문자열로 num1, num2 의 합을 return 해라

        // 조건
        // num1, num2의 길이는 1000 미만이다.
        // 둘 다 num1 및 num2는 숫자만 포함한다
        // num1 num2는 선행 0을 포함하지 않는다.

        // 문제 Format
//    class Solution {
//        public String solve(String num1, String num2) {
//
//        }
//    }

        String num1 = "123";
        String num2 = "888";
        System.out.println(new Test().solve(num1, num2));

    }

    public String solve(String num1, String num2) {
        //1 담을 그릇을 정한다.
        int carry =0;
        StringBuilder sb = new StringBuilder();

        int num1Length = num1.length() - 1; //
        int num2Length = num2.length() - 1; //

        //2
        while(num1Length >= 0 || num2Length >= 0) {
            int n1=0, n2=0;
            if(num1Length >=0) {
                n1 = num1.charAt(num1Length) - '0'; // String 을 integer 로 바꾸는 함수
            }

            if(num2Length >=0) {
                n2 = num2.charAt(num1Length) - '0'; // String 을 integer 로 바꾸는 함수
            }

            int sum = n1 + n2 + carry;
            carry = sum / 10; // 11에서 10을 나눈 나머지 1을 다음 자리로 올린다.
            sb.append(sum%10);
            num1Length--;
            num2Length--;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    // 모든 문제의 풀이 솔루션 단계
    // 1. 문제를 정확히 이해한다.
    // 2. 사용할 알고리즘을 정하고 담을 그릇 (자료구조)을 정한다.
    // 3. for, while 문을 돌리고 그 안에 알고리즘 넣기

    // 많이 사용되는 함수
    // charAt(), substring()
    // int num = str.charAt(i) - '0';


}
