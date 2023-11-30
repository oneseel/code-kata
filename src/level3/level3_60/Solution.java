package level3.level3_60; // 기사단원의 무기

class Solution {
  public int solution(int number, int limit, int power) {
    int weight = 0; // 철의 무게
    int[] numberArray = new int[number]; // 1부터 number까지 약수의 개수가 들어있는 배열

    for (int i = 0; i < number; i++) {
      numberArray[i] = countDivisors(i + 1);
      if (numberArray[i] <= limit) {
        weight += numberArray[i];
      } else {
        weight += power;
      }
    }
    return weight;
  }

  // 약수의 개수 구하는 메소드
  private int countDivisors(int n) {
    int count = 0;

    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        if (n / i == i) {
          count++;
        } else {
          count += 2;
        }
      }
    }

    return count;
  }
}

