// * 문제

// Input : 1->2->3,
//         8->8->8

// Output: 1011

// 문자열처럼 생긴 음이 아닌 정수 값 num1, num2
// 문자열로 num1, num2 의 합을 return 해라

// * 조건

// 1. num1, num2의 길이는 1000 미만이다.
// 2. num1 및 num2는 숫자만 포함한다
// 3. num1 num2는 선행 0을 포함하지 않는다.

// * 사용 Format

//    class Solution {
//        public String solve(String num1, String num2) {
//
//        }
//    }
public class Practice {

    public static void main (String[] args) {

        String num1 = "54321";
        String num2 = "54321";

        System.out.println(new Practice().solve2(num1, num2));
    }

        public String solve2(String num1, String num2) {

            StringBuilder builder = new StringBuilder();

            int rest = 0;

            // num1Length = 2 (0,1,2)
            int num1Length = num1.length()-1;
            int num2Length = num2.length()-1;

            while (num1Length >= 0 || num2Length >= 0) {
                int targetA = 0;
                int targetB = 0;

                // 3 + 8
                targetA = num1.charAt(num1Length) -'0';
                System.out.println("targetA=" +targetA);

                targetB = num2.charAt(num2Length) -'0';
                System.out.println("targetB=" +targetB);

                int sum = targetA + targetB + rest;

                System.out.println(targetA+" + "+targetB+" + "+rest+" = "+ sum);

//                System.out.println(result);
                // result = 11

                // 두번째 1은 string builder 에 사용
                int lastNumber = sum%10;
                System.out.println("lastNumber = "+lastNumber);
                builder.append(lastNumber);

                rest = sum / 10; // 11에서 10을 나눈 나머지 1을 다음 자리로 올린다.

                num1Length--;
                num2Length--;
            }

            if (rest != 0) {
                builder.append(rest);
            }

            // num1 역순으로 하나씩 조회
            // num2 역순으로 하나씩 조회해서 a+b 처리
            // 결과값이 10 넘는다면 1을 다음 자리 수에 + 한다.
            return builder.reverse().toString();
        }

}
