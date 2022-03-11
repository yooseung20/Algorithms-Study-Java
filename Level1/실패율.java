//시간초과ㅠㅠㅠㅠ

import java.util.*;
import java.util.Scanner;

class Solution {
    public int[] solution(int N, int[] stages) {
        // 스테이지별 도전한 사람
        // 스테이지별 실패한 사람
        int[] tried_person = new int[N];
        int[] stages_info = new int[N];
        
        
        int[] answer = new int[N];
        
        for(int i:stages){
            if(i == N+1){
                continue;
            }
            stages_info[i-1] ++; // 스테이지에 실패한 사람
        }
        
        int dummy = stages.length;
        
        tried_person[0] = dummy;
        
        for(int i=1; i < tried_person.length; i++){
            dummy -= stages_info[i-1];
            tried_person[i] = dummy;
        }
        
        // 스테이지별 실패율 기록
        ArrayList<Double> fail = new ArrayList<Double>();    
        for(int i=0; i < N; i++){
            fail.add((double) stages_info[i]/tried_person[i]);
        }
        
        for(int i=0; i < fail.size(); i++){
            double max = Collections.max(fail);
            int index = fail.indexOf(max);
            answer[i] = index + 1;    
            fail.set(index, -1.0);
        }
        
        
        return answer;
    }
}

