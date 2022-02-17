import java.lang.Math;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        
        int[] a = {1, 2, 3, 4, 5};  // i == 5 일때, 1
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5}; // i == 8 일때, 2
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // i =10일때, 3
        
        for(int i =0; i < answers.length; i++){
            if(answers[i] == a[i % a.length]) score[0]++;
            if(answers[i] == b[i % b.length]) score[1]++;
            if(answers[i] == c[i % c.length]) score[2]++;
        }

        int maxscore = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // arrayList -> add 사용가능
        // maxscore와 같은 값을 가지는 응시자 추가
        for(int i= 0; i < 3; i++){
            if(maxscore == score[i]){
                list.add(i+1);}
        }
        // ArrayList는 length-> no, size() -> ok
        int[] answer = new int[list.size()];
            
         for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}