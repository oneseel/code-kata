package level2.level2_21; // 하샤드 수

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int originalX = x;

        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        if (originalX % sum == 0) {
            return true;
        }
        return false;
    }
}