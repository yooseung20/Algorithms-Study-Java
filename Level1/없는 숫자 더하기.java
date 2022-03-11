import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 45; //1부터 9까지의 합
        for(int number : numbers){
            answer -= number;
        }
        return answer;
    }
}