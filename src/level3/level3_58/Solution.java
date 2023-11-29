package level3.level3_58; // 소수 만들기

class Solution {
  public int solution(int[] nums) {
    int count = 0; // 소수의 개수

    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          int sum = nums[i] + nums[j] + nums[k];
          count = isPrime(sum) ? count + 1 : count;
        }
      }
    }
    return count;
  }

  // 소수 확인 메서드
  public boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}