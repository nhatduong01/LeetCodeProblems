class Solution {
public int reverse(int x) {
    int num=0;
    while(x!=0)
    {
        int dig=x%10;
        x=x/10;
        if(num>Integer.MAX_VALUE/10  || num<Integer.MIN_VALUE/10 )
            return 0;
        num=num*10+dig;
        
    }
    return num;
}
}