package level2.level2_36; // 문자열 다루기 기본

// 정규식을 이용한 풀이
class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("[0-9]+");
        }
        return false;
    }
}

// isDigit()를 이용한 풀이
//class Solution {
//    public boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6) {
//            for (char c : s.toCharArray()) {
//                if (!Character.isDigit(c)) {
//                    return false;
//                }
//            }
//            return true;
//        }
//        return false;
//    }
//}