package level4.level4_78; // 피보나치 수

class Solution {
  // 다이나믹 프로그래밍(Dynamic Programming)을 사용 : 시간복잡도를 줄일 수 있다.
  public int solution(int n) {
    if (n < 2) {
      return n;
    }

    int[] dp = new int[n + 1];
    dp[1] = dp[2] = 1;

    for (int i = 3; i <= n; i++) {
      dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
    }

    return dp[n];
  }

  public static void main(String[] args) {
    int n = 5;
    Solution solution = new Solution();
    int answer = solution.solution(n);
    System.out.println(answer);
  }
}