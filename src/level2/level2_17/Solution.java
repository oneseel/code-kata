package level2.level2_17; // 자연수 뒤집어 배열로 만들기

class Solution {
    public int[] solution(long n) {
        String nStr = Long.toString(n);
        String[] nStrSplit = nStr.split("");
        int[] numbers = new int[nStrSplit.length];

        for (int i = 0; i < nStrSplit.length; i++) {
            numbers[i] = Integer.parseInt(nStrSplit[nStrSplit.length - i -1]);
        }
        return numbers;
    }
}