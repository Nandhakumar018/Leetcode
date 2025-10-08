class Solution {
    public int findNumbers(int[] nums) {
        ArrayList<Integer> digits=new ArrayList<>();
        for(int num:nums){
            digits.add(String.valueOf(num).length());
        }
        int count=0;
        for(int digit:digits){
            if(digit%2 == 0){
                count++;
            }
        }
        return count;
    }
}