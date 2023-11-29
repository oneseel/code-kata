package level3.level3_41; // 이상한 문자 만들기

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArray = s.split("");
        int count = 0;

        for(String s2 : sArray) {
            count = s2.equals(" ") ? 0 : count + 1;
            sb.append(count % 2 != 0 ? s2.toUpperCase() : s2.toLowerCase());
        }
        return sb.toString();
    }
}