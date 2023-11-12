package level2.level2_8; // 문자열을 정수로 바꾸기

class Solution {
    public int solution(String s) {
        int answer = 0;

        if (s.contains("-")) {
            String sReplace = s.replace("-", "");
            answer = Integer.parseInt(sReplace);
            return -answer;
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}