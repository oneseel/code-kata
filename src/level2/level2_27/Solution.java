package level2.level2_27; // 핸드폰 번호 가리기

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        char[] chars = phone_number.toCharArray();

        for (int i = 0; i < length - 4; i++) {
            chars[i] = '*';
        }

        for (char c : chars) {
            answer = answer + c;
        }
        return answer;
    }
}