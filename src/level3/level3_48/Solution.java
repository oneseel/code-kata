package level3.level3_48; // K번째수

import java.util.Arrays;

class Solution {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int commandI = commands[i][0];
      int commandJ = commands[i][1];
      int commandK = commands[i][2];

      int[] array2 = Arrays.copyOfRange(array, commandI - 1, commandJ);
      Arrays.sort(array2);
      answer[i] = array2[commandK - 1];
    }

    return answer;
  }
}