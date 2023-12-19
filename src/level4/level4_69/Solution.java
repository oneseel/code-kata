package level4.level4_69; // 성격 유형 검사하기

class Solution {
  public String solution(String[] survey, int[] choices) {

    int[] character = new int[8]; // 각 성격지표 배열
    // R, T, C, F, J, M, A, N

    for (int i = 0; i < survey.length; i++) {
      if (survey[i].equals("RT")) rCheck(choices, character, i);
      else if (survey[i].equals("TR")) tCheck(choices, character, i);
      else if (survey[i].equals("CF")) cCheck(choices, character, i);
      else if (survey[i].equals("FC")) fCheck(choices, character, i);
      else if (survey[i].equals("JM")) jCheck(choices, character, i);
      else if (survey[i].equals("MJ")) mCheck(choices, character, i);
      else if (survey[i].equals("AN")) aCheck(choices, character, i);
      else if (survey[i].equals("NA")) nCheck(choices, character, i);
    }

    StringBuilder sb = new StringBuilder();

    sb.append(character[0] >= character[1] ? "R" : "T");
    sb.append(character[2] >= character[3] ? "C" : "F");
    sb.append(character[4] >= character[5] ? "J" : "M");
    sb.append(character[6] >= character[7] ? "A" : "N");

   return sb.toString();
  }

  private void updateCharacter(int[] choices, int[] character, int i,
      int idx1, int idx2) {
    if (choices[i] == 1) character[idx1] += 3;
    else if (choices[i] == 2) character[idx1] += 2;
    else if (choices[i] == 3) character[idx1] += 1;
    else if (choices[i] == 4) character[idx1] += 0;
    else if (choices[i] == 5) character[idx2] += 1;
    else if (choices[i] == 6) character[idx2] += 2;
    else if (choices[i] == 7) character[idx2] += 3;
  }

  private void rCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 0, 1);
  }

  private void tCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 1, 0);
  }

  private void cCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 2, 3);
  }

  private void fCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 3, 2);
  }

  private void jCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 4, 5);
  }

  private void mCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 5, 4);
  }

  private void aCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 6, 7);
  }

  private void nCheck(int[] choices, int[] character, int i) {
    updateCharacter(choices, character, i, 7, 6);
  }

  public static void main(String[] args) {
    String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
    int[] choices = {5, 3, 2, 7, 5};
    Solution solution = new Solution();
    String answer = solution.solution(survey, choices);
    System.out.println(answer); // TCMA
  }
}