package level2.level2_3;

public class Solution {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            int num = n % 10;
            sum += num;
            n /= 10;
        }
        return sum;
    }
}
