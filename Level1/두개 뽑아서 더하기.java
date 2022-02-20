import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        
        // 2개 뽑아 만들 수있는 모든 경우의 수를 담을 변수 
        ArrayList<Integer> possibility = new ArrayList<>();
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1 ; j<numbers.length; j++)
                possibility.add(numbers[i]+numbers[j]);
        }
        
        ArrayList<Integer> possibility2 = new ArrayList<>();
        for(int p : possibility){
          if(!possibility2.contains(p))
            possibility2.add(p);

        }
        
        Collections.sort(possibility2);
        int[] answer = new int[possibility2.size()];
        
        for(int i=0; i < possibility2.size(); i++){
            answer[i] = possibility2.get(i);
        }

        
        
        return answer;
    }
}