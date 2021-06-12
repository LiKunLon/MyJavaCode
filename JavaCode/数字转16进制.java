class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] chars = new char[]{'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer buffer = new StringBuffer();
        int temp;
        while (num != 0) {
            temp = num & 15;
            buffer.insert(0, chars[temp]);
            num >>>= 4;
        }
        return buffer.toString();


 
    }
}