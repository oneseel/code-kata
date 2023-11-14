package level2.level2_22; // 두 정수 사이의 합

class Solution {
    public long solution(int a, int b) {
        long sum = 0;

        if (a < b) {
            for (int i = a; i <= b ; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a ; i++) {
                sum += i;
            }
        } else {
            sum = a;
        }
        return sum;
    }
}