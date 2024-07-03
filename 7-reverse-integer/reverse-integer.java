class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int b;
        while(x!= 0){
            b = x % 10;
            x = x / 10;
            if(reversed > Integer.MAX_VALUE/10 ||  reversed == Integer.MAX_VALUE/10 && b > 7)  
            return 0;
            if(reversed < Integer.MIN_VALUE / 10 ||  reversed == Integer.MIN_VALUE/10 && b < -8)
            return 0;

            reversed= (reversed*10) + b;
        }

        return reversed;
        
    }
}