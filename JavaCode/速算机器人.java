class Solution {
    public int calculate(String s) {
    // return 1<<s.length();
        int x=1;
        int y=0;
        for(int i=0;i<s.length();i++){
            char index=s.charAt(i);
            if(index=='A'){
                x=2*x+y;
            }else {
                y=2*y+x;  
            }
        }
        return x+y;
    }
}