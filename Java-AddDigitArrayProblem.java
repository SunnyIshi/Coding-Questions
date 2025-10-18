class Solution {
    public int addDigits(int num) {
       // int sol = (num-1)%9+1;
        // return sol;
        if(num ==0){
            return 0;
        }
        if(num % 9 ==0){
            return 9;
        }
        return num%9;
        //return (num%9 ==0)?9:num%9;
    }
   
}