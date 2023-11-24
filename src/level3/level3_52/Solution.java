package level3.level3_52; // 콜라 문제

class Solution {
  public int solution(int a, int b, int n) {
    int answer = 0;

    while(n >= a) {
      int num1 = n / a * b;
      int num2 = n % a;
      answer += num1;
      n = num1 + num2;
    }
    return answer;
  }
}
