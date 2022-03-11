import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Arrays.sort(participant); // n명
        Arrays.sort(completion);  // n-1명
        for(int i=0; i < completion.length; i++){  // 작은 범위 기준
            // 문자열 비교 equeals
            if(! participant[i].equals(completion[i])){ 
                return participant[i];
            }
        }
        
        return participant[participant.length -1];
    }
}