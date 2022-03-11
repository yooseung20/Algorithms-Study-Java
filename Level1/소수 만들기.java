class Solution {
    public int solution(int[] nums) {
        int answer = 0;
         
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    int temp = nums[i] + nums[j] + nums[k];
                    if (check_sosu(temp)){
                        answer +=1;
                    }
                }
            }
        }
        return answer;
    }
    public boolean check_sosu(int num){
        boolean check = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                check = false;
                return check;
            }
        }
        return check;
    }
    
}