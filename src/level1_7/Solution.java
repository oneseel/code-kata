package level1_7; // 두 수의 나눗셈

class Solution {
    public int solution(double num1, double num2) {
        double answer = (num1 / num2) * 1000;
        return (int)answer;
    }
}