package level4.level4_77; // 이진 변환 반복하기

class Solution {
  public int[] solution(String s) {
    int binaryCount = 0; // 이진 변환 횟수
    int zeroCount = 0; // 제거한 0의 개수

    while (!s.equals("1")) {
      for (char c : s.toCharArray()) {
        zeroCount += c == '0' ? 1 : 0;
      }

      String s1 = s.replace("0", ""); // 0을 제거
      binaryCount++;

      int length = s1.length(); // 0을 제거한 s의 길이
      s = Integer.toBinaryString(length); // 10진수를 2진수로 변환
    }

    return new int[]{binaryCount, zeroCount};
  }

  public static void main(String[] args) {
    String s = "110010101001";
    Solution solution = new Solution();
    int[] answer = solution.solution(s);
    System.out.println("이진변환 횟수 : " + answer[0]);
    System.out.println("제거한 0의 개수 : " + answer[1]);
  }
}