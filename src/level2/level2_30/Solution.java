package level2.level2_30; // 가운데 글자 가져오기

class Solution {
    public String solution(String s) {
        String[] sArray = new String[s.length()];
        String answer = "";
        for(int i = 0; i < s.length(); i++) {
            sArray[i] = String.valueOf(s.charAt(i));
        }

        if (sArray.length % 2 == 0) {
            answer = sArray[sArray.length / 2 - 1] + sArray[sArray.length / 2];
        } else {
            answer = sArray[sArray.length / 2];
        }
        return answer;
    }
}
