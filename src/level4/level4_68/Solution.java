package level4.level4_68; // 햄버거 만들기

/*
1 : 빵
2 : 야채
3 : 고기
햄버거 순서 : 1 -> 2 -> 3-> 1
 */

import java.util.Stack;

class Solution {

  public int solution(int[] ingredient) {
    int answer = 0; // 햄버거의 수

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < ingredient.length; i++) {
      stack.add(ingredient[i]);

      if (stack.size() >= 4) {
        int size = stack.size();
        if (stack.get(size - 1) == 1 &&
            stack.get(size - 2) == 3 &&
            stack.get(size - 3) == 2 &&
            stack.get(size - 4) == 1
        ) {
          answer++;
          stack.pop();
          stack.pop();
          stack.pop();
          stack.pop();
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
    Solution solution = new Solution();
    System.out.println(solution.solution(ingredient)); // 2
  }
}