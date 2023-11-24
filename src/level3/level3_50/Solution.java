package level3.level3_50;

class Solution {
  public int[] solution(String s) {
    int length = s.length();
    int[] answer = new int[length];

    for(int i = 0; i < length; i++){
      if(i != 0) {
        int idx = s.substring(0, i).lastIndexOf(s.charAt(i));
        if(idx != -1){
          answer[i] = i - idx;
        }
        else{
          answer[i] = idx;
        }
      }
      else{
        answer[i] = -1;
      }
    }
    return answer;
  }
}