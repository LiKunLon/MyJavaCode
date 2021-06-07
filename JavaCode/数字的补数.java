class Solution {
    public int findComplement(int num) {
        String res="";
        String number=Integer.toBinaryString(num);
        for(int i=0;i<number.length();i++){
            res+=number.charAt(i)^'1';
        }
        return Integer.parseInt(res,2);
    }
}