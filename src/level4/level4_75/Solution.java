package level4.level4_75; // 최댓값과 최솟값

class Solution {
  public String solution(String s) {
    String[] numbers = s.split(" ");
    int[] number = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      number[i] = Integer.parseInt(numbers[i]);
    }

    // 최댓값, 최솟값
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int num : number) {
      if (num > max) max = num;
      if (num < min) min = num;
    }

    String maxString = String.valueOf(max);
    String minString = String.valueOf(min);

    return minString + " " + maxString;
  }

  public static void main(String[] args) {
    String s = "1 2 3 4";
    Solution solution = new Solution();
    String answer = solution.solution(s);
    System.out.println(answer);
  }
}