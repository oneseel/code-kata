package level2.level2_40; // 3진법 뒤집기

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int temp = n % 3;
            sb.append(temp);
            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }
}
